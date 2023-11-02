package com.dicoding.kotlin.dataclass

/* Set
* Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik,
* Artinya set tidak boleh menampung nilai duplikat
*
* */
fun main() {
    // deklarasi Set
    val integerSet = setOf(1, 2, 4, 2, 1, 5)

    // deklarasi set (eksplisit)
    val set: Set<Int> = setOf(1,12,4,4,2)

    // gabungan dan irisan pada set
    val setC = setOf(1, 5, 7)
    val union = set.union(setC)
    val intersect = set.intersect(setC)

    println(union)
    println(intersect)

    // mutableSetOf() -> digunakan untuk menambah dan menghapus nilai didalam Set tidak dengan mengubah
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah mutableSet
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}