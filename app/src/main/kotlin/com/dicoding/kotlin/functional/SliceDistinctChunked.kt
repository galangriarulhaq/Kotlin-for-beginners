package com.dicoding.kotlin.functional

fun main() {
    // function slice() filtered as desired
    // sama halnya dengan take, akan tetapi penyaringan dapat di tentukan pada posisi tertentu
    // jadi fungsi ini membutuhkan 2 parameter untuk dijalankan
    val total1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total1.slice(3..6)

    println(slice)

    // function distinct() same item filtering
    // fungsi ini digunakan untuk menyaring item yang sama dengan melakukan iterasi dan membandingkan setiap itemnya.
    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total2.distinct()

    println(distinct)

    // function chunked() breaking down value string
    // fungsi chunked() bisa digunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.
    // chunked() membutuhkan parameter yang akan digunakan sebagai jumlah indeks untuk pemisah.
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)

}