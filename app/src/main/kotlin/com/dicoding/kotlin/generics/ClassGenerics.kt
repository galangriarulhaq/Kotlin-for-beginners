package com.dicoding.kotlin.generics

// class generics
// bisa di deklarasikan dengan meletakkan tipe parameter ke dalam angle brackets (<>)

interface List<T>{
    operator fun get(index: Int) : T
}

// Pada kode di atas, tipe parameter T bisa kita gunakan sebagai tipe reguler
// yang mengembalikan tipe dari sebuah fungsi.


// mendeklarasikan sebuah class yang mewarisi interface generics
class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

// Pada kelas LongList di atas, Long digunakan sebagai tipe argumen untuk List,
// sehingga fungsi yang berada di dalamnya akan menggunakan Long sebagai tipe dasarnya.
// Berbeda dengan kelas ArrayList, di mana tipe argumen untuk kelas List menggunakan T
// Dengan demikian ketika menggunakan kelas ArrayList,
// perlu menentukan tipe argumen dari kelas tersebut saat diinisialisasi.

