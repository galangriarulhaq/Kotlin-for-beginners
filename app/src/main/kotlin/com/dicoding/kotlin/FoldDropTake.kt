package com.dicoding.kotlin

fun main() {
    val numbers = listOf(1, 2, 3)
    // Fold Collection
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold")

    // drop (remove first index ) / dropLast (remove last index) Collection
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop)

    // take Collection (reverse drop)
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    // function slice() filtered as desired
    val total1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total1.slice(3..6)

    println(slice)

    // function distinct() same item filtering
    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total2.distinct()

    println(distinct)

    // function chunked() breaking down value string
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)


}