package com.dicoding.kotlin.controlflow

fun main(){

    val value = 10

    // sama hal nya dengan if namun lebih efisian
    when (value) {
        10 -> println("value is 10")
        11 -> println("value is 11")
        else -> println("error")
    }

    val ranges = 10..50

    // mengecek value pada sebuah range
    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }

}