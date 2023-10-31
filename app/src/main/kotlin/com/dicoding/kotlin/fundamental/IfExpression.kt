package com.dicoding.kotlin.fundamental

fun main() {
    // Statement if
    val openHours = 7
    val now = 20
    val office: String
    if (now >= openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    print(office)

    // if Expression (di simpan dalam sebuah variabel)
    val openHours1 = 7
    val now1 = 20
    val office1: String
    office1 = if (now1 > openHours1) {
        "Office already open"
    } else {
        "Office is closed"
    }

    print(office)
}