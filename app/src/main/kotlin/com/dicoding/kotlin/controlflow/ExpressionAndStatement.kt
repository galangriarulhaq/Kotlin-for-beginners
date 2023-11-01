package com.dicoding.kotlin.controlflow

fun main() {
    val value1 = 10
    val value2 = 10

    // if Statement
    if (value1 == value2){
        println(true)
    }else{
        println(false)
    }

    // if Expression
    var hasil = if (value1 == value2) true else false
    println(hasil)

    sum(value1, value2)
}

fun sum(value1: Int, value2: Int) = value1 + value2

/*
* Pada kode di atas deklarasi variabel value1 dan value2 merupakan sebuah statement.
* Sedangkan pemanggilan fungsi sum seperti yang dijelaskan di atas,
*  merupakan sebuah expression.
* */