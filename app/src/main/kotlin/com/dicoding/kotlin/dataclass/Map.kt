package com.dicoding.kotlin.dataclass

fun main() {
    // map (collection yang dapat menyimpan data dengan format key-value.)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    // Memanggil value data pada map menggunakan "key"
    println(capital["Jakarta"])

    // Output: Indonesia

    // bisa juga menggunakan getValue()
    println(capital.getValue("Jakarta"))

    // fungsi untuk mengetahui "key" apa saja yang ada pada map
    val mapKeys = capital.keys

    // mapKeys: [Jakarta, London, New Delhi]

    // fungsi untuk mengetahui "value" apa saja yang ada pada map
    val mapValues = capital.values

    // mapValues: [Indonesia, England, India]
}