package com.dicoding.kotlin.functional

// vararg digunakan menyederhanakan beberapa
// parameter yang memiliki tipe data yang sama menjadi parameter tunggal

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)
    val number1 = intArrayOf(10, 20, 30, 40)
    println(sets(10, 20, 20, *number1 , 10))
}

fun sets(vararg number: Int): Int {
    return number.sum()
}