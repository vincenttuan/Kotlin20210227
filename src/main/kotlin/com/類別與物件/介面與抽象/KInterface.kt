package com.類別與物件.介面與抽象

interface Clickable {
    fun click() // 一般抽象方法
    fun showOff() { // 類似 java 介面的 default 方法
        println("I am clickable!")
    }
}

interface Focusable {
    fun setFocus(b: Boolean) // 一般抽象方法
    fun showOff() { // 類似 java 介面的 default 方法
        println("I am focusable!")
    }
}

class Button: Clickable {
    override fun click() {
        println("Button clicked!")
    }
}

class TextField: Clickable, Focusable {
    override fun click() {
        println("TextField clicked!")
    }

    override fun setFocus(b: Boolean) {
        println("I ${if(b) "got" else "lost"} focus.")
    }

}

fun main() {
    val btn = Button()
    btn.showOff()
    btn.click()
}