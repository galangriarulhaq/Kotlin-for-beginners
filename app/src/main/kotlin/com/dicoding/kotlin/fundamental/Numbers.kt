package com.dicoding.kotlin.fundamental

fun main() {
    // int (32 bit)
    val intNumber = 100
    // long (64 bit)
    val longNumber1: Long = 100
    val longNumber2 = 100L
    // short (16 bit)
    val shortNumber: Short = 10
    // byte (8 bit) byte dapat membaca stream file atau jaringan
    val byteNumber = 0b11010010
    // double (64 bit) - pecahan (max 15-16 di belakang koma)
    val doubleNumber: Double = 1.3
    // float (32 bit) - pecahan (max 6-7 di belakang koma)
    val floatNumber: Float = 0.123456789f

    // konversi data with kotlin
    val byteNumber1: Byte = 10
    val intNumber1: Int = byteNumber1.toInt() // ready to go

    // readable number with kotlin
    val readableNumber = 1_000_000
    print(readableNumber)
}