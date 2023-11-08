package com.dicoding.kotlin.functional

fun main() {
    val numbers = listOf(1, 2, 3)
    // Fold Collection
    // Fungsi fold() memerlukan 2 (dua) argumen yaitu nilai awal untuk perhitungan dan lambda expression
    // yang nilai kembaliannya digunakan untuk menentukan nilai awal selanjutnya.
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold")

    // drop (remove first index ) / dropLast (remove last index) Collection
    // fungsi yang bisa dimanfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang ditentukan
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop)

    // take Collection (reverse drop)
    // fungsi take() bisa dimanfaatkan untuk menyaring item yang berada di dalam sebuah objek collection.
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)



}