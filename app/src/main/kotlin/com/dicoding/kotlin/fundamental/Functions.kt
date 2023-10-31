package com.dicoding.kotlin.fundamental

// Arsitektur functions di kotlin
//fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
//    return result
//}

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

// functions expression body, secara eksplisit / type data kembalian
//fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun main() {
    val user = setUser("Alfian", 19)
    println(user)

}