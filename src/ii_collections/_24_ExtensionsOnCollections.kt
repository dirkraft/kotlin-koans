package ii_collections

import util.TODO

fun todoTask24(): Nothing = TODO(
    """
        Task 24.
        The function should behave the same as '_24_JavaCode.doSomethingStrangeWithCollection'
        Replace all invocations of 'todoTask24()' with the appropriate code.
    """,
        references = { c: Collection<String> -> _24_JavaCode().doSomethingStrangeWithCollection(c) }
)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    // The java version returns the largest set of strings of equal length.

    val groupsByLength = collection.groupBy { it.length }

    return groupsByLength.values.maxBy { it.size }
}

