package com.dicoding.kotlinoop



// this is default constructor
open class Person {
    // this is properties
    open var firstName: String = ""
    var lastName: String = ""

    open fun sayHello(){
        println("Hello! $firstName $lastName")
    }
}

// this is inheritance
class Boy(pgender: String) : Person(){
    // property overriding
    override var firstName: String = "Boy"

    var gender: String = pgender
    // function overriding
    override fun sayHello() {
        println("Hai! $firstName $lastName")
    }
}

// this is primary constructor and property constructor
class Country (var name: String, var address: String)

fun main() {
    // this is Object

    val galang = Person()
    val kota = Country("Tasikmalaya", "Mitra Batik")

    val person = Boy("boy")

    person.firstName = "Galang"
    person.lastName = "Riarulhaq"

    person.sayHello()

    println(person.firstName)
    println(person.gender)
    println(person.lastName)

//    println(kota.name)
//    println(kota.address)
//    println(galang.firstName)
//    galang.firstName = "Galang"
//    println(galang.firstName)
//    println(galang.lastName)

    val car = Car("Toyota", 2019)
    val car2 = Car("Jazz")

    println(car.brand)
    println(car.year)
    println(car2.brand)
    println(car2.year)
}
