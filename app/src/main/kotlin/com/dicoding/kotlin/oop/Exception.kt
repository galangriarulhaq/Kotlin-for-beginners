package com.dicoding.kotlin.oop

// Kode yang baik yaitu kode yang terhindar dari segala bentuk kejadian dengan efek buruk pada aplikasi kita.
// Kejadian tersebut pada programming disebut Exception.
// Hal terburuk yang disebabkan oleh exception ini adalah dapat terhentinya aplikasi ketika dijalankan.

// Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program. Pada Kotlin semua exception bersifat Unchecked
// 3 contoh unchecked exception yang sering mengacaukan jalannya program:
// ArithmeticException
// ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol
// NumberFormatException
// NumberFormatException disebabkan karena terjadi kesalahan dalam format angka
// NullPointerException
// NPE terjadi karena sebuah variabel atau objek memiliki nilai null, padahal seharusnya objek atau variabel tersebut tidak boleh null.

fun main() {
    val someValue = 6
    // contoh ArithmeticException
    println(someValue / 0)

    // contoh NumberFormatException
    val someStringValue = "18.0"
    println(someStringValue.toInt())

    // contoh NullPointerException
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}