package com.dicoding.kotlin.controlflow

fun main() {

    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    // Break (digunakan untuk menghentikan proses iterasi).
    for (i in listOfInt) {
        if (i == null) break // contoh penggunaan Break
        print(i)
    }

    // Continue (digunakan untuk melewatkan proses iterasi)

    for (i in listOfInt) {
        if (i == null)  continue // contoh penggunaan Continue
        print(i)
    }

    // Break and Continue Labels
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }

    /*
    * Pada kode diatas, break yang sudah ditandai dengan label akan dilompati ke titik awal
    * proses perulangan yang sudah ditandai dengan label.
    *  break akan menghentikan proses perulangan terluar dari dalam proses perulangan,
    *  di mana break tersebut dipanggil.
    * */
}
