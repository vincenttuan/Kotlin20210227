package com.ktest

fun main() {
    // 集合 Set, List, Map
    val set = hashSetOf<Int>(1, 5, 2, 7, 6, 3)
    val list = arrayListOf<Int>(1, 5, 2, 7, 6, 3)
    val map = hashMapOf<Int, String>(1 to "One", 5 to "Five", 7 to "Seven", 3 to "Three")
    println(set)
    println(list)
    println(map)

    println(set.max())
    println(set.maxOrNull())

    val nums = hashSetOf<Int>(10, 42, 5, 4) // 除以3的餘數 (1, 0, 2, 1)
    // set 除以3的餘數 最大值
    println(nums.maxByOrNull { n -> n % 3 })
    // set 除以3的餘數 最小值
    println(nums.minByOrNull { it % 3 })

    val set2 = hashSetOf<Int>(1, 5, 2, 7, 6, 3)
    // set2 求出偶數的最大值


}