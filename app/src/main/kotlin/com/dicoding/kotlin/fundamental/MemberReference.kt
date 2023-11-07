package com.dicoding.kotlin.fundamental

/* Member Reference
    merupakan pemisahan lambda expression menjadi fungsi tersendiri dan mereferensikannya langsung sebagai instance
 * Function Reference
    merupakan best practice dalam penggunaan function, menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type.
 * Property Reference
    Merupakan penggunaan Operator :: agar dapat mengakses getter and setter
* */

// Member Reference (reflection)
val sum: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB
: Int): Int {
    return valueA + valueB
}

fun isEvenNumber(number: Int) = number % 2 == 0

var message = "kotlin"

fun main() {
    val numbers = 1.rangeTo(10)
    // deklarasi function reference
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)

    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}