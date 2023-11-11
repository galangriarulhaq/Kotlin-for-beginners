package com.dicoding.kotlin.oop

// Class merupakan sebuah blueprint. Di dalam kelas ini kita
// mendefinisikan sesuatu yang merupakan attribute ataupun behaviour

//Class: Merupakan sebuah blueprint yang terdapat properti dan fungsi di dalamnya
//Properties: Karakteristik dari sebuah kelas, memiliki tipe data.
//Functions: Kemampuan atau aksi dari sebuah kelas.

// deklarasi class
class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean
) {

    fun eat(){
        println("$name makan !")
    }

    fun sleep() {
        println("$name tidur !")
    }
}

fun main() {
    // deklarasi object pada class Animal
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2,true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()
}