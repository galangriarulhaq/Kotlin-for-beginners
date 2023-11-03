package com.dicoding.kotlin.dataclass

fun main() {
    // Filter() dan FilterNot()
    // fungsi ini dapat menghasilkan list baru berdasarkan kondisi yang diberikan
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // contoh implementasi Filter()
    val evenList = numberList.filter { it % 2 == 0 }

    // evenList: [2, 4, 6, 8, 10]

    val numberList1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // contoh implementasi FilterNot() -> kebalikan dari Filter()
    val notEvenList = numberList1.filterNot { it % 2 == 0 }

    // notEvenList: [1, 3, 5, 7, 9]

    // map()
    // Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan
    // dari collection sebelumnya
    val numberListMap = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // contoh implementasi map()
    val multipliedBy5 = numberListMap.map { it * 5 }

    // it pada kode di atas akan merepresentasikan masing masing item pada numberList.
    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    // count()
    // Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.
    val numberListCount = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberListCount.count())

    // Output: 10

    // find(), firstOrNull(), lastOrNull
    // Fungsi find() ini memiliki cara kerja yang sama dengan fungsi firstOrNull().
    // Artinya, jika di dalam collection tidak ditemukan data yang sesuai,
    // maka fungsi akan mengembalikan nilai null
    // Kemudian jika Anda ingin mencari item terakhir, gunakan fungsi lastOrNull().

    // comtoh implementasi find()
    val firstOddNumber = numberList.find { it % 2 == 1 }
    // contoh implementasi firstOrNull()
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    // firstOddNumber: 1
    // firstOrNullNumber: null

    // sum()
    // fungsi ini digunakan untuk menjumlahkan setiap item yang ada pada data collection
    val total = numberList.sum()

    // total: 55

    println(total)

    // sorted()
    // sorted() digunakan untuk mengurutkan item yang ada di dalam collection
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // ascendingSort: [i, k, l, n, o, t]

    // sortedDescending()
    // Kebalikan dari fungsi sorted()
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // descendingSort: [t, o, n, l, k, i]


}