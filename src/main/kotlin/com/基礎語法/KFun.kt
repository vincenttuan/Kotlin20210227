package com.基礎語法

// 存取修飾字(預設是 public) fun 方法名稱(參數名1: 參數型態, 參數名1: 參數型態...): 回傳型態 {
//    方法區塊實作
//    return 回傳結果
// }

fun add(x:Int, y:Int): Int {
    val sum = x + y
    return sum
}

fun sub(x:Int, y:Int = 0): Int {
    val sum = x - y
    return sum
}

fun mul(x:Int = 0, y:Int = 0): Int {
    val sum = x - y
    return sum
}

fun div(x:Int = 0, y:Int = 0): Int {
    val sum = x / y
    return sum
}

fun main(args: Array<String>) {
    println(add(10, 20))
    println(sub(10, 20))
    println(sub(10))
    println(mul(10, 20))
    println(mul())
    println(div(y=1))
}
