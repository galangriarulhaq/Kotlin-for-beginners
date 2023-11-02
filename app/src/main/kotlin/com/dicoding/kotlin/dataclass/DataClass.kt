package com.dicoding.kotlin.dataclass

// Class
class User(val name : String, val age : Int)

// Data Class
data class DataUser(val name : String, val age : Int)


fun main() {
    val user = User("Galang", 20)
    val dataUser = DataUser("Galang", 20)

    println(user)
    println(dataUser)

    // copy() dataClass
    val dataUser1 = dataUser.copy()
    println(dataUser1)
    /* kelebihan Data Class di banding class biasa
    * data class akan secara otomatis menghasilkan fungsi toString() di dalamnya.
    * kelebihan lain dari data class adalah ia sudah memiliki fungsi equals() secara otomatis.
    * menyalin sebuah objek dengan sangat mudah hanya dengan memanfaatkan fungsi copy().
    * */
}