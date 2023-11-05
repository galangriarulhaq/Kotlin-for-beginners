package com.dicoding.kotlin.functional

fun main(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
                if (i == 5){
                    break@loopI
                }
                println("$i * $j = ${i * j}")
            }
    }
}