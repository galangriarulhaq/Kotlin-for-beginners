package com.dicoding.kotlin.coroutines

import  kotlinx.coroutines.*

/*  Job
 Job adalah sebuah hasil dari perintah asynchronous yang dijalankan.
 Objek dari job akan merepresentasikan coroutine yang sebenarnya.
 Sebuah job akan memiliki 3 (tiga) properti yang nantinya bisa dipetakan ke dalam setiap state atau keadaan.
 Berikut adalah ketiga properti tersebut:

 isActive
    Sebuah properti yang menunjukkan ketika sebuah job sedang aktif.
 isCompleted
    Sebuah properti yang menunjukkan ketika sebuah job telah selesai.
 isCancelled
    Sebuah properti yang menunjukkan ketika sebuah job telah dibatalkan.

* */

// Job dapat diinisialisasikan menggunakan fungsi launch() maupun Job() seperti berikut:

//menggunakan launch():
//fun main() = runBlocking {
//    val job = launch {
//        // Do background task here
//    }
//}

//menggunakan Job():
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    // Menjalankan dapat menggunakan fungsi start() dan join()
    job.start()
    println("Other task")
}

// Membatalkan Job
// Membatalkan job dapat dilakukan dengan memanggil fungsi cancel(), dan hanya job yang active yang dapat di batalkan

// @InternalCoroutinesApi
//fun main() = runBlocking {
//    val job = launch {
//        delay(5000)
//        println("Start new job!")
//    }
//
//    delay(2000)
//    job.cancel(cause = CancellationException("time is up!"))
//    println("Cancelling job...")
//    if (job.isCancelled){
//        println("Job is cancelled because ${job.getCancellationException().message}")
//    }
//}

