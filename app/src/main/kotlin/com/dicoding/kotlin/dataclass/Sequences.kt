package com.dicoding.kotlin.dataclass

fun main() {
    // Sequences
    // Sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluation.
    // lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan.

    // contoh implementasi Sequences menggunakan fungsi asSequence()
    val list = (1..10000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    // Untuk membuat objek Sequence
    // fungsi yang tersedia pada standard library yaitu generateSequence().
    val sequenceNumber = generateSequence(2) { it + 4 }
    sequenceNumber.take(2).forEach { print("$it ") }

    // Output: 1 2 3 4 5
}
