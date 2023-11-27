package com.dicoding.kotlin.coroutines

// coroutine dispatcher
// untuk mengoptimalkan penggunaaan coroutine di butuhkan sebuah base class yaitu coroutine dispatcher
// Di dalam kelas tersebut akan ditemukan beberapa objek yang nantinya bisa digunakan untuk menentukan thread yang berfungsi menjalankan coroutines.

/* objek objek yang ada pada coroutine dispatcher
*   Dispatcher.Default
*    Merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti launch, async,
*    dll jika tidak ada dispatcher lain yang ditentukan.
*   Dispatcher.IO
*    sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O.
*    Ia akan menggunakan kumpulan thread yang dibuat berdasarkan permintaan.
*   Dispatcher.Unconfined
*    Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan.
*    Setelah penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.
*   Single Thread Context
*    Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan.
*    Untuk menerapkannya, bisa dengan memanfaatkan newSingleThreadContext()
*   Thread pool
*    Thread Pool adalah sebuah dispatcher yang memiliki kumpulan thread. Ia akan memulai dan melanjutkan coroutine
*    di salah satu thread yang tersedia pada kumpulan tersebut. thread pool bisa di terapkan dengan fungsi newFixedThreadPoolContext()
*
* */

// salah satu penerapan coroutine dispatcher menggunakan thread pool
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}