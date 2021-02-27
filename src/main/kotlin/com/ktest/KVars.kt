package com.ktest

fun getPrice(): Int {
    return 100
}

fun main(args: Array<String>) {
    // 宣告變數
    var x = 10; // 可再指派變數 var
    x = 11
    println(x)
    val y = 20 // 不可再指派變數 val
    //y = 11
    println(y)
    // var or val 變數名稱 : 變數型態 = 初始值
    val pi : Double = 3.14 // val pi = 3.14
    println(1.0/2)
    println(0.1+0.1 == 0.2)
    println(0.1+0.1+0.1 == 0.3)
    println(0.1+0.1+0.1)
    // 印出資料
    // BMI 練習
    val h = 170.0
    val w = 60.0
    val bmi = w / Math.pow(h/100, 2.0)
    println(bmi)
    println("bmi: %.2f".format(bmi))
    println("bmi: $bmi")
    println("bmi: ${bmi * 2}")
    var price = 100
    println("cost = ${price * 0.4}")
    println("cost = ${getPrice() * 0.4}")
}