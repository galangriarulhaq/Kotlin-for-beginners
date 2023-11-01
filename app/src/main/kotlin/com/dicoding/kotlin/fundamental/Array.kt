package com.dicoding.kotlin.fundamental

fun main() {
    //Array (memiliki fungsi get dan set serta properti size)
    // array 1 type data
    val array = arrayOf(1, 3, 5, 7)

    // array berbagai jenis type data
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    // array type data primitif
    /*
    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
    * */
    val numberArray = intArrayOf(1,2,3,4)
}