package com.dicoding.kotlin.functional

fun main() {
    // anonymous function
    val upper = fun(value: String): String{
        if (value == ""){
            return "ups"
        }else {
            return value.toUpperCase()
        }
    }

    println(upper("galang"))

    // closure
    val counter: Int = 0
    val lambdaCounter: () -> Unit = {
        println("Lambda Increment")
    }

    lambdaCounter()

    println(counter)


}