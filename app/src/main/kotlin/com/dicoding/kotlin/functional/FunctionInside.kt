package com.dicoding.kotlin.functional


// inner function merupakan pemisahan fungsi menjadi sebuah fungsi lokal,
// dengan hak terbatas hanya bisa di akses dengan fungsi terluarnya

// implementasi inner function
fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}