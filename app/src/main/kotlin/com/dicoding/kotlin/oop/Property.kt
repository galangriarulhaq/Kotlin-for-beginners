package com.dicoding.kotlin.oop

import kotlin.reflect.KProperty

// Sebuah kelas dalam Kotlin tentu memiliki properti. Masing - masing kelas memiliki properti yang berbeda.
// Contoh sebelumnya pada kelas Animal, properti yang dimiliki berupa name, weight, age dan isMammal.

class Animal1{
    // property Accessor pada class mutable
    var name: String = "Dicoding Miaw"
}

class DelegateName {
    // property delegation
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal2 {
    // deklarasi property delegation pada class
    var name: String by DelegateName()
}

fun main(){
    val dicodingCat = Animal1()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
    val cat = Animal2()
    cat.name = "Kucing"
    println("Nama Hewan : ${cat.name}")
}

// Secara standar ketika properti pada kelas dibuat mutable,
// maka Kotlin akan menghasilkan fungsi getter dan setter pada properti tersebut.