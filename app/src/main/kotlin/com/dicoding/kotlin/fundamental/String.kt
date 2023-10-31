package com.dicoding.kotlin.fundamental

fun main() {
    // String (Penggabungan string menggunakan $variabel)
    val text  = "Kotlin"
    println("bahasa pemograman $text")

    // Raw String (berguna untuk menuliskan multiline text)
    val line = """
        line 1
        line 2
        line 3
    """.trimIndent()
    println(line)
}