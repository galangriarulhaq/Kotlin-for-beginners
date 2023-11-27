package com.dicoding.kotlin.coroutines

/* Channels
*   Channels adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine.
*   Pada dasarnya, channels sangat mirip dengan BlockingQueue [11]. Namun, alih-alih memblokir sebuah thread,
*   channels menangguhkan sebuah coroutine yang jauh lebih ringan.
* */

// contoh penggunaan channels pada coroutine
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
}

// Kesimpulannya, channels memungkinkan komunikasi yang aman antar kode concurrent. Ia membuat kode concurrent
// dapat berkomunikasi dengan mengirim dan menerima pesan tanpa harus peduli di thread mana coroutine berjalan.