package com.dicoding.kotlin.oop

class Car(ParamsBrand: String, ParamsYear: Int) {
    var brand: String = ParamsBrand
    var year: Int = ParamsYear

    // this is secondary constructor
    constructor(ParamsBrand: String) : this(ParamsBrand, 2020){
        println("Secondary Constructor")
    }
}