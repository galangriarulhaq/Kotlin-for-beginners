package com.dicoding.kotlin.functional

/* Scope Function
*  adalah cara menuliskan logika kode di dalam konteks dari sebuah objek.
*  Beberapa fungsi yang berada di dalamnya antara lain let, run, with, apply, dan also.
*
* */

// Context Object (hal yang harus di ketahui sebelum mengenal Scope Function)
// Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) dan lambda argumen (it).

// Lambda receiver object (this) -> run, with, dan apply.

val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}

// Lambda receiver object (it) -> let dan also

fun main() {
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
}