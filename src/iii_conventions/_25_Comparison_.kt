package iii_conventions

import util.TODO
import util.doc25

fun todoTask25(): Nothing = TODO(
    """
        Task 25.
        Uncomment the commented line and make it compile. 
        Add all changes to the file MyDate.kt.
        Make class MyDate implement Comparable.
    """,
    documentation = doc25(),
    references = { date: MyDate, comparable: Comparable<MyDate> -> }
)

fun task25(date1: MyDate, date2: MyDate): Boolean {
    return date1 < date2
}

operator fun MyDate.compareTo(other: MyDate): Int = when {
    year != other.year -> year.compareTo(other.year)
    month != other.month -> month.compareTo(other.month)
    dayOfMonth != other.dayOfMonth -> dayOfMonth.compareTo(other.dayOfMonth)
    else -> 0 // They are equal
}
