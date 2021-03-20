package com.進階控制.檔案存取

import java.io.File

// 讀取檔案資料
fun read() {
    File("data.txt").bufferedReader().lines().forEach{
        println(it)
    }
}

// 寫入資料
fun write(data: String) {
    File("data.txt").appendText("$data \n")
}

fun main() {
    read()
    write("VB")
    read()
}