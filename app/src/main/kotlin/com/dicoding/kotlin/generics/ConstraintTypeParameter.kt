package com.dicoding.kotlin.generics

/* Constraint Type Parameter
    Dalam penerapan generic, kita bisa membatasi tipe apa saja yang dapat digunakan sebagai parameter.
    Untuk menentukkan batasan tersebut, bisa dengan menambahkan tanda titik dua (:)
    setelah tipe parameter yang kemudian diikuti oleh tipe yang akan dijadikan batasan.
*/



fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
//  val numbers3 = ListNumber<String>() -> error : Type argument is not within its bounds
}

class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        /* .. */
        return this[index]
    }

}