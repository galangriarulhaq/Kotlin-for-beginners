package com.dicoding.kotlin.oop

/**
 * visibility modifiers
 * public : hak akses yang paling luas
 * private: hak akses yang paling terbatas
 * protected: hak akses yang cakupannya hanya pada  hirarki class
 * internal: hak akases yang cakupannya hanya pada satu modul saja
 */

// public
class Member(var name: String)

// private
class Personal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

// protected
open class Animal5(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal5(pName, pWeight)

// internal
internal class Hewan(val name: String)

fun main() {
    // pemanggilan class public
    val member = Member("Luffy")
    println(member.toString())

    // pemanggilan class private
    val dicoding = Personal("Dicoding", 2.5, 2)
    println(dicoding.getName())
    dicoding.setName("Gooose")
    println(dicoding.getName())

    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
//    println("Berat Kucing: ${cat.weight}") -> error: expecting a top level declaration

}


