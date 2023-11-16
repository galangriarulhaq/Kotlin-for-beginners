package com.dicoding.kotlin.generics

// Generics, yaitu sebuah konsep yang memungkinkan suatu kelas atau
// interface menjadi tipe parameter yang dapat digunakan untuk berbagai macam tipe data.
// Secara umum generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan digunakan.
// Pendeklarasiannya ditandai dengan tipe parameter

// contoh pendeklarasian generics pada variabel list dengan type data string
val contributor = listOf<String>("jasoet", "alfian","nrohmen","dimas","widy")

// contoh lain untuk generics, pada kelas Map yang memiliki dua tipe parameter yang digunakan sebagai key dan value.
val points = mapOf<String, Int>( "alfian" to 10 , "dimas" to 20 )
