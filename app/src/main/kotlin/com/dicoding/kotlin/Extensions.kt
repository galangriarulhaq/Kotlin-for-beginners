package com.dicoding.kotlin

fun main(){
    "Galang".printIn()
    println(10.slice)
}

// this is Extension function
fun String.printIn(){
    println("this is $this")
}

// this is Extensions property
val Int.slice: Int
    get() = this

