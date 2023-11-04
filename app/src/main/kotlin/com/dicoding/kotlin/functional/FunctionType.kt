package com.dicoding.kotlin.functional

// function type untuk tipe deklarasi yang berhubungan dengan sebuah fungsi.
// (Int, Int) -> String (parameter pada function tersebut bertype Int namun memiliki kembalian String)

typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}


