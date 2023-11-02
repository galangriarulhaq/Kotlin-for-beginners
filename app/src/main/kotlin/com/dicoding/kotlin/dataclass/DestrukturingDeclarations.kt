package com.dicoding.kotlin.dataclass

    // Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel
fun main() {
    val dataUser = DataUser("Galang", 20)
    val name = dataUser.component1()
    val age = dataUser.component2()

        println("My name is $name, I am $age years old")
}
