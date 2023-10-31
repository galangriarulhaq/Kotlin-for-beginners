package com.dicoding.kotlin.fundamental

fun main() {
    // boolean
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    // (operator AND &&)
    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    // (operator OR ||)
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")

    // (operator NOT !)
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }


}