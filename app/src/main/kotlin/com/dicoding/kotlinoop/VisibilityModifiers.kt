package com.dicoding.kotlinoop

/**
 * visibility modifiers
 * public : hak akses yang paling luas
 * private: hak akses yang paling terbatas
 * protected: hak akses yang cakupannya hanya pada  hirarki class
 * internal: hak akases yang cakupannya hanya pada satu modul saja
 */

class Member(var name: String)

fun main() {
    val member = Member("Luffy")

    println(member.toString())


}


