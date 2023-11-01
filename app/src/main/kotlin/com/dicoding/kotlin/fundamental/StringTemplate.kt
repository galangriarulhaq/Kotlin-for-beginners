package com.dicoding.kotlin.fundamental

fun main() {
    // String template (cara penyajian nya cukup dengan menambahkan '$' sebelum nama variabel)
    // implementasi String template
    val name = "Kotlin"
    val old = 3
    print("My name is $name, im $old years old")

    // String template juga dapat di sisipkan expression
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")

}