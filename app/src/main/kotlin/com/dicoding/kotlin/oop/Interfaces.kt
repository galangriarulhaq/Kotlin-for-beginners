package com.dicoding.kotlin.oop

// Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu kelas
// agar dapat memiliki sifat tersebut.

// Cara pembuatan sebuah interface mirip dengan membuat kelas.
// Pada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital.

interface IFly {
    fun fly()
    val numberOfWings: Int
}

// Cara mengimplementasikan sebuah interface pada kelas,
// sama seperti kita melakukan extends pada sebuah super atau parent class.

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

// anonymous class
// Seperti namanya, yang dimaksud dengan anonymous adalah class yang tak memiliki nama.
// Alih-alih mendefinisikan class menggunakan keyword class,
// Anda bisa langsung mendefinisikan isi dari sebuah class dengan menggunakan keyword object: .
