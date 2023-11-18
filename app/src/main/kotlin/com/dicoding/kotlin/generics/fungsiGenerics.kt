package com.dicoding.kotlin.generics

/* Mendeklarasikan fungsi generics
*  Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi yang berhubungan dengan List.
*  Misalnya, list yang dapat digunakan untuk berbagai tipe dan tidak terpaku pada tipe tertentu.
*  Fungsi generic memiliki tipe parameternya sendiri. Tipe argumen dari parameternya ditentukan ketika fungsi tersebut dipanggil.
*
* */

public fun <T> List<T>.slice(indices: Iterable<Int>) {
    /*...*/
}

fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))
}