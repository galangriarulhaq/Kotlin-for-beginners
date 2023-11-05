package com.dicoding.kotlin.functional

fun main() {
    // Call Lambda with receiver
    val message1 = buildString {
        append("Hello")
        append(" Galang!")
    }
    println(message1)
}

// create lambda with receiver
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
