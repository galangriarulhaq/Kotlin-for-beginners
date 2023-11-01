package com.dicoding.kotlin.fundamental

fun main() {
    // NullableType (merupakan penanganan variabel dapat bernilai null atau tidak)
    // deklarasi NullableType (variabel dapat bernilai null)
    val text: String? = null


    // salah satu cara mengelola variabel atau objek yang bersifat NullableType
    if (text != null){
        val textLength = text.length // ready to go
    }
}