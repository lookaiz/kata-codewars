package com.lookaiz.kyu7

fun findShort(s: String): Int {
    return s.split(" ").map { it.length }.min()!!
}

fun findShort2(s: String)= s.split(" ").minBy{ it.length }?.length
