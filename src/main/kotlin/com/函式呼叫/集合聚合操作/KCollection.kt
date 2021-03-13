package com.函式呼叫.集合聚合操作

fun main() {
    var numbers = listOf(6, 42, 10, 4)
    println("Count: ${numbers.count()}")
    println("Sum: ${numbers.sum()}")
    println("Avg: ${numbers.average()}")
    println("Max: ${numbers.max()}")
    println("Min: ${numbers.min()}")
    println("Max: ${numbers.maxByOrNull { it }}")
    println("Min: ${numbers.minByOrNull { it }}")


}