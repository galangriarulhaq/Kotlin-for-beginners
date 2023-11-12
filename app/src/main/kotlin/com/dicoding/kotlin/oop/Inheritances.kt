package com.dicoding.kotlin.oop

// inheritance/pewarisan merupakan bentuk pencegahan perulangan pada code


// parent class
open class Animals(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {

    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }

}

// child class (class cats inherit ke class animals)
// penerapan inheritance
class Cats(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animals(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

// Dengan begitu, selain fungsi yang terdapat di dalamnya,
// kelas Cats juga dapat mengakses seluruh fungsi dan properti yang terdapat kelas Animals.

fun main(){
    val dicodingCats = Cats("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCats.playWithHuman()
    dicodingCats.eat()
    dicodingCats.sleep()
}


