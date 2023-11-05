package com.dicoding.kotlin.functional

// Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
// Inline adalah fitur dalam bahasa Kotlin yang memungkinkan Anda untuk menyertakan seluruh kode
// dari suatu fungsi atau lambda (expression function) pada saat kompilasi,

fun main() {
    printResult2(10 ,sum)
    printResult1(10, sum)
}

var sum: (Int) -> Int = { value -> value + value }

// Higher-order-function
fun printResult2(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

// inline function
inline fun printResult1(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
