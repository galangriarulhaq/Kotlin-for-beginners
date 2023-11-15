package com.dicoding.kotlin.oop

// Exception handling merupakan solusi agar dapat menangani exception pada program yang ada
// Exception handling dapat diterapkan dengan beberapa cara.
// Di antaranya adalah dengan menggunakan try-catch, try-catch-finally, dan multiple catch.

// try-catch
// Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch.
// Kode yang dapat membangkitkan suatu exception disimpan dalam blok try, dan jika exception tersebut terjadi,

// try-catch-finally
// Selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional.
// finally akan dieksekusi setelah program keluar dari blok try ataupun catch.

// Multiple catch
// Multiple catch memungkinkan untuk penanganan exception dapat ditangani lebih dari satu tipe exception.
// Hal ini sangat berguna ketika kita ingin menangani setiap tipe exception dengan perlakuan yang berbeda.

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    // penerapan try-catch and try-catch-finally
    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    } finally {
        println(someMustNotNullValue)
    }

    val someStringValue: String? = null
    var someIntValue: Int = 0

    // penerapan multiple catch
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}