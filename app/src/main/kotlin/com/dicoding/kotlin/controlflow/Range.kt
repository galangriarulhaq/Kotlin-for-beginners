package com.dicoding.kotlin.controlflow

fun main() {

    // range pada kotlin mencakup pada IntRange, LongRange, dan CharRange
    // deklarasi range (IntRange)
    val rangeInt = 1..10

    // untuk mendapatkan step (jarak antar nilai)
    println(rangeInt.step)

    // mengubah step (jarak antar nilai)
    val rangeInt1 = rangeInt step 2

    // fungsi rangeTo() pada range
    val rangeInt2 = 1.rangeTo(10)

    // fungsi downTo() pada range -> merupakan kebalik dari rangeTo()
    val downInt = 10.downTo(1)

    // deklarasi range (CharRange)
    val rangeChar = "A".rangeTo("G")


}