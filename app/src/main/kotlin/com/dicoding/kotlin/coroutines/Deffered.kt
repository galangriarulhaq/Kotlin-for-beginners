package com.dicoding.kotlin.coroutines

// Deffered
// fungsi async akan mengembalikan nilai deferred yang berupa hasil atau exception.
// Deferred adalah nilai tangguhan yang dihasilkan dari proses coroutines.
// Pada dasarnya, nilai deferred juga merupakan sebuah job. Ia diciptakan dan dimulai pada saat coroutines mencapai state active.
// Dengan begitu, deferred juga bisa diaktifkan saat fungsi start, join, atau await dipanggil.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}

// capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.

