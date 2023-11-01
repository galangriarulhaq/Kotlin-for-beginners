package com.dicoding.kotlin.fundamental

fun main() {
    // safe calls and elvis operator merupakan cara mudah untuk mengelola objek nullable

    // safe calls (?.)
    val text: String? = null
    text?.length
    //Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.

    // elvis operator (?:)
    val text1: String? = null
    val textLength = text1?.length ?: 7
    //Elvis operator digunakan untuk menetapkan default value atau nilai dasar jika objek bernilai null.


}