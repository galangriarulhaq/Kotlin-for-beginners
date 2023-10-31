package com.dicoding.kotlin

class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)


fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("Galang", 17)

    //Copy data class
    val dataUser1 = dataUser.copy(name = "Luffy")

    //Result name package dan memory address
    println(user)
    //Result data txt
    println(dataUser)
    println(dataUser.name)
    println(dataUser1)

    //Create list
    val myList = listOf(1,2,3,4,5)

    println(myList)

    //filter in list
    val evenList = myList.filter { it % 2 == 0 } //Output : [2, 4]

    //filterNot in list
    val notEvenList = myList.filterNot { it % 2 == 0 } //Output : [1, 3, 5]

    //Create set
    val mySet  = setOf(1,2,3,1,3,4)

    println(mySet)

    //Create map
    val myMap = mapOf(
            "Luffy" to "Captain",
            "Zorro" to  "Wk.Captain"
    )

    println(myMap)
}