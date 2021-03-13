package com.函式呼叫.集合聚合操作

// Pair 與 Triple
fun main() {
    // Pair
    // val p = Pair(1, "A")
    val p = 1 to "A" // 利用中序(infix)指令建構
    println(p)
    println(p.javaClass)
    println(p.toList())
    println("${p.first} ${p.first.javaClass}, ${p.second} ${p.second.javaClass}")

    // Triple
    // 置入單一型別的元素
    //val t = Triple(4, 5, 6)
    // 置入不同型別的元素
    val t = Triple("I am a string", listOf(1, 2, 3), 10)
    println("${t.first} ${t.second} ${t.third}")
    println("${t.first.javaClass} ${t.second.javaClass} ${t.third.javaClass}")
    println("${t.component1()} ${t.component2()} ${t.component3()}")

    // 解構 Pair, Triple

}
