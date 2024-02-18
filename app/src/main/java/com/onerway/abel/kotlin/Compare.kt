package com.onerway.abel.kotlin

fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250

    println(compareNum(timeSpentToday, timeSpentYesterday))
}

fun compareNum(today: Int, yesterday: Int): Boolean {
    return today > yesterday
}