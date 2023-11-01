package com.dicoding.kotlin.controlflow

fun main() {
    // For Loop
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

    // For Loop indexing
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    // For Each
    ranges.forEach { value ->
        println("value is $value!")
    }

    // For Each indexing
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}