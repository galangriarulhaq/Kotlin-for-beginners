package com.dicoding.kotlin.functional

fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    println(fullName)

    val fullname1 = getFullNameArgument()
    println(fullname1)

    // mangubah argument pada default argument
    val fullname2 = getFullNameArgument(first = "Galang")
    println(fullname2)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

// menggunakan default argument
fun getFullNameArgument(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
    }
