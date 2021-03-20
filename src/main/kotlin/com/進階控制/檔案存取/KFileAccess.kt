package com.進階控制.檔案存取

import java.io.File

// 讀取檔案資料
fun read() {
    File("data.txt").bufferedReader().lines().forEach{
        println(it)
    }
}

fun main() {
    read()
}