package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.*

//Dengan menambahkan dependensi di atas, maka udah dapat menggunakan fitur-fitur coroutines dalam membuat program concurrency.

// Coroutines merupakan fitur unggulan pada Kotlin yang diperkenalkan pada Kotlin versi 1.1. Saat ini coroutines sudah mencapai versi 1.5.1.
// Coroutines adalah cara baru untuk menulis kode asynchronous dan non-blocking.
// Seperti tagline-nya “Don’t block, Keep moving” yang dikenalkan pada saat rilis Kotlin versi 1.3. [9]

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}

 

