package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange {
    return DateRange(this, other)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {

        var cursor: MyDate = start;

        override fun hasNext(): Boolean {
            return cursor <= endInclusive;
        }

        override fun next(): MyDate {
            val next = cursor
            cursor = next.addTimeIntervals(TimeInterval.DAY, 1)
            return next
        }
    }
}
