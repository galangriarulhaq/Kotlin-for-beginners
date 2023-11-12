package com.dicoding.kotlin.oop

// abstract merupakan gambaran umum dari sebuah kelas. Ia tidak dapat direalisasikan dalam sebuah objek.
// jadi bisa di sebutkan bahwasannya abstract class adalah blueprint dari sebuah child class-nya.

abstract class Animalss(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}


