package com.dicoding.kotlin.coroutines

// Concurrency adalah beberapa proses yang terjadi secara bersamaan dalam suatu sistem.
// Concurrency merupakan suatu fenomena alami yang umum terjadi.
// Untuk bisa memahami dan juga menerapkan concurrency dengan benar,
// developer perlu mempelajari beberapa konsep dasar seperti Process, Thread dan I/O bound.

// Process
// Sebuah proses (process) merupakan bagian dari aplikasi yang sedang dijalankan.
// Setiap kali aplikasi dijalankan, maka saat itu juga proses dijalankan.

// Thread
// Thread biasa dikenal dengan proses yang ringan.
// Membuat thread baru membutuhkan lebih sedikit sumber daya daripada membuat proses baru.

// I/O-bound
// I/O-bound merupakan sebuah algoritma yang bergantung pada perangkat input atau output.
// Waktu untuk mengeksekusi sebuah I/O-bound tergantung pada kecepatan perangkat yang digunakan.

// Ada beberapa permasalahan yang wajib bisa  ditangani pada concurrency,
// yaitu deadlocks, livelocks, starvation dan juga race conditions.

// deadlocks
// deadlocks, yaitu sebuah kondisi di mana dua proses atau lebih saling menunggu proses yang lain untuk melepaskan resource yang sedang digunakan.
// Deadlocks mengakibatkan proses-proses yang sedang berjalan, tak kunjung selesai.
// Kasus ini merupakan umum terjadi ketika banyak proses yang saling berbagi sumber daya.

// livelocks
// Sama halnya dengan deadlocks, livelocks juga merupakan kondisi di mana sebuah proses tidak bisa melanjutkan tugasnya.
// Namun yang membedakannya adalah bahwa selama livelocks terjadi, keadaan dari aplikasi tetap bisa berubah.
// Walaupun perubahan keadaan tersebut menyebabkan proses berjalan dengan tidak semestinya.

// starvation
// Starvation merupakan sebuah kondisi yang biasanya terjadi setelah deadlock. Kondisi deadlock sering kali
// menyebabkan sebuah proses kekurangan sumber daya sehingga mengalami starvation atau kelaparan.
// Selain deadlock, hal lain yang bisa mengakibatkan starvation adalah ketika terjadi kesalahan sistem. Akibatnya, ada ketimpangan dalam pembagian sumber daya.

// race condition
// Race condition merupakan masalah umum pada concurrency, yaitu kondisi di mana terdapat banyak thread
// yang mengakses data yang dibagikan bersama dan mencoba mengubahnya secara bersamaan.

