package com.dicoding.kotlin.functional

// Kotlin mendukung 2 (dua) extension yang dapat digunakan, yaitu Extension Functions dan Extension Properties.
// Jika extension functions digunakan untuk menambahkan fungsi baru,
// extension properties tentunya digunakan untuk menambahkan sebuah properti baru.


fun main(){
    "Galang".printIn()
    println(10.slice)
    val value: Int? = null
    println(value.slice1)
}

// this is Extension function
fun String.printIn(){
    println("this is $this")
}

// this is Extensions property
val Int.slice: Int
    get() = this

// Nullable receiver
val Int?.slice1: Int
    get() = this?.div(2) ?: 0
