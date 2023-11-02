package com.dicoding.kotlin.dataclass

/* List
* List digunakan untuk menyimpan banyak data menjadi satu objek.
* List tersebut bersifat immutable alias tidak bisa diubah
* */

fun main() {
    // deklarasi list secara eksplisit
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    println(numberList)

    // deklarasi list non eksplisit
    val charList = listOf('a', 'b', 'c')
    println(charList)

    // list dengan type data yang berbeda
    val anyList = listOf('a', "Kotlin", 3, true)
    println(anyList)

    // cara mengakses list dengan posisi tertentu, yaitu dengan indexing[]
    println(anyList[1])

    // mutableListOf() -> digunakan untuk mengelola nilai didalam list
    val anyList1 = mutableListOf('a', "Kotlin", 3, true)

    anyList1.add('d') // menambah item di akhir list
    anyList1.add(1, "love") // menambah item pada indeks ke-1
    anyList1[3] = false // mengubah nilai item pada indeks ke-3
    anyList1.removeAt(0) // menghapus item pada indeks ke-0
}