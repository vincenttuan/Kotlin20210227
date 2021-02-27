package com.ktest

import kotlin.random.Random

fun getLevel(score: Int) = when(score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    else -> "E"
}

// if , when, for, while, do while
fun main(args: Array<String>) {
    // if
    var score = Random.nextInt(101)
    val pass = if(score >= 60) "Pass" else "Fail"
    println("$score $pass")

    // when
    // 100~90 "A", 89~80 "B", 79~70 "C", 69~60 "D", 59~0 "E"
    when(score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("E")
    }
    var level = when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }
    println(level)

    level = when(score/10) {
        10, 9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "E"
    }
    println(level)

    println(getLevel(score))


}