package com.dicoding.kotlin

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

// inner function
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}

fun main() {
    println(factorialLoop(5))
    println(factorialRecursive(10))
    //display(100)
    println(sum(10,10,10))
}
