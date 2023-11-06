package com.dicoding.kotlin.functional

/* Scope Function with Lambda Receiver
    1. run (Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda).
    Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
    2. with (fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa).
    Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver.
    3. apply (nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this)).
    Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
* */

fun main() {
    // run
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    // with
    val message = "Hello Kotlin!"
    val result1 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

    // apply
    val message1 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message1.toString())
}
