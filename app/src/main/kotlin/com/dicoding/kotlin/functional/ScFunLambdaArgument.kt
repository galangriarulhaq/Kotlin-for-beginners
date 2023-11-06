package com.dicoding.kotlin.functional

/* Scope Function With Lambda Argument
    1. let (Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek).
     Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe nullable.
    2. also (ungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek).
     Namun untuk konteks objeknya tersedia sebagai argumen (it).
* */

fun main() {
    // let
    val message: String? = null
    val length = message?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

    // also
    val text1 = "Hello Kotlin"
    val result = text1.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}