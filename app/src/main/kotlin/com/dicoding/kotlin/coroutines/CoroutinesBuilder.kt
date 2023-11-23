package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// penerapan coroutine dengan async
// bayangkan jika di dalam code memiliki 2 suspending function, seperti berikut:

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}


// fun main() = runBlocking {
//    val capital = getCapital()
//    val income = getIncome()
//    println("Your profit is ${income - capital}")
// }

// Pada kode di atas, fun main menggunakan pendekatan sequential. Kenapa? Pada dasarnya kode di dalam coroutines
// juga dijalankan secara berurutan seperti kode normal lain.

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")

}

// dengan menggunakan async maka proses eksekusi akan lebih cepat di bandingkan tanpa async