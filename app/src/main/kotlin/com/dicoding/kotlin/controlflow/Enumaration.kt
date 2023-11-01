package com.dicoding.kotlin.controlflow

fun main() {
    // enumaration (menyimpan kumpulan objek bertype data konstanta)
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    colorRed.printValue()

}

    // untuk mendefinisikan enum class cukup dengan kata kunci enum sebelum class
    enum class Color(val value: Int) {
        RED(0xFF0000){
            override fun printValue() {
                println("value of RED is $value")
            }
        },
        GREEN(0x00FF00){
            override fun printValue() {
                println("value of GREEN is $value")
            }
        },
        BLUE(0x0000FF){
            override fun printValue() {
                println("value of BLUE is $value")
            }
        };

        abstract fun printValue()
    }
