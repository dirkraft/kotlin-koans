package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // Return customers who have more undelivered orders than delivered

    fun Customer.areOrdersMostlyUndelivered(): Boolean {
        val numUndelivered = this.orders.filter { !it.isDelivered }.size
        val half = this.orders.size / 2
        return numUndelivered > half
    }

    // This is silly without using both partitions. Normally a filter would be enough.
    return this.customers.partition { it.areOrdersMostlyUndelivered() }.first.toSet()
}
