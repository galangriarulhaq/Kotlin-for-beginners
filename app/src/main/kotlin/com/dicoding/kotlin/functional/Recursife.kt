package com.dicoding.kotlin.functional

// Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri.
// Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali.

fun factorialLoop(value: Int): Int{
    var result = 1
    for (i in value downTo 1){
        result *= i
    }
    return  result
}

// recursive function potential stack overflow
fun factorialRecursive(value: Int): Int{
    return when(value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

// tail recursive solution stack overflow
tailrec fun display(value: Int) {
    println(value)
    if (value > 0){
        display(value - 1)
    }
}


fun main() {
    println(factorialLoop(5))
    println(factorialRecursive(10))
    //display(100)
    println(sum(10,10,10))
}
