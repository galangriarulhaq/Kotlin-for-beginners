package com.dicoding.kotlin.generics

/* Variance
*  Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe
*  yang sama dan tipe argumen yang berbeda saling berkaitan satu sama lain.
*  Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic dengan batasan yang tidak akan mengganggu dalam penggunaannya.
* */

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
}

// Covariant pada variant bertipe parameter dengan kata kunci out
// maka nilai dari tipe parameter tersebut hanya bisa diproduksi seperti menjadikanya sebagai return type.
interface Angka<out E> : Collection<E> {
    operator fun get(index: Int): E
}

// Contravariant pada variant bertipe parameter dengan kata kunci in
// Nilai dari tipe parameter tersebut bisa dikonsumsi dengan menjadikannya sebagai tipe argumen untuk
// setiap fungsi yang ada di dalam kelas tersebut dan tidak untuk diproduksi.

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}