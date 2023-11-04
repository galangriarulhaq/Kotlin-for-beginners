package com.dicoding.kotlin.functional

// Lambda expression, biasa disebut dengan anonymous function atau function literal
// adalah fitur yang cukup populer sampai sekarang dalam dunia functional programming.


fun main() {
    // Lambda Expression
    val message = { println("Hello From Lambda") }
    message()

    // Call higher-order-function
    printResult(10){value -> value + value}

    // Call Lambda with receiver
    val message1 = buildString {
        append("Hello")
        append(" Galang!")
    }
    println(message1)

    // Lambda Argument (it)
    val text = "Hello"
    text.let {
        val message2 = "$it Kotlin"
        println(message2)
    }

    // Scope function with lambda receiver (run)
    val text1 = "Hello"
    val result = text1.run {
        val from = this
        val to = this.replace("Hello", "Kotlin2")
        "replace text from $from to $to"
    }
    println("result : $result")
    // Scope function with lambda receiver (with)
    val message3 = "Hello Galang!"
    val result1 = with(message3) {
        println("value is $this")
        println("with length ${this.length}")
    }
    result1.toString()

    // Scope function with lambda receiver (apply)
    val message4 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message4.toString())

    // Scope function with lambda argument (let)
    val message5: String? = null
    message5?.let {
        val length = it.length * 2
        val text2 = "text length $length"
        println(text2)
    }

    // Scope function with lambda argument (let)
    val text3 = "Hello Kotlin"
    val result2 = text3.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result2")

    // Member/Method references using ::
    val number = 2.rangeTo(19)
    val evenNumbers = number.filter(::isEvenNumber)

    println(evenNumbers)

    // Call higher-order-function
    println(hello("Luffy", { value: String -> value.toUpperCase() }))
}


// higher-order function
fun hello(name: String, transform: (String) -> String): String{
    val nameTransform = transform(name)
    return "Hello $nameTransform"
}

// higher-order-function
inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

// Lambda with receiver
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun isEvenNumber(number: Int) = number % 2 == 0