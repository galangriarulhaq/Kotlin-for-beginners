package com.dicoding.kotlin.oop

// Konstruktor merupakan fungsi spesial yang digunakan untuk menginisialisasi properti yang terdapat pada kelas tersebut.
// Terdapat 2 (dua) tipe konstruktor pada Kotlin, yaitu primary constructor dan secondary constructor.

// primary constructor
//  Penulisan primary constructor mirip seperti parameter pada fungsi.
//  Properti cukup dituliskan pada header class diawali dengan var atau val.

class Animal3(name: String, weight: Double, age: Int){
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    // secondary constructor
    // secondary constructor digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain.
    // secondary constructor dapat di buat lebih dari satu.
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

// Default constructor
// Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat sebuah konstruktor secara manual.
// Ketika kita membuat sebuah objek, default konstruktor akan dipanggil.
// Konstruktor tersebut akan menginisialisasi properti yang terdapat pada kelas dengan nilai default.
class Animal4{
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}


fun main(){
    val dicodingCat = Animal3("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    val dicodingCat1 = Animal4()
    println("Nama: ${dicodingCat1.name}, Berat: ${dicodingCat1.weight}, Umur: ${dicodingCat1.age}, mamalia: ${dicodingCat1.isMammal}" )
}