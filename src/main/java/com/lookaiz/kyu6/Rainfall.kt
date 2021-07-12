package com.lookaiz.kyu6

import kotlin.math.pow

fun mean(town:String, strng:String): Double {
    val values = values(town, strng)
    return if (values.isEmpty()) -1.0 else values.average()
}

fun variance(town:String, strng:String):Double {
    val values = values(town, strng)
    if (values.isEmpty()) return -1.0
    val mean = values.average()
    return values.map { v -> (v - mean).pow(2.0) }
            .sum() / values.size
}

private fun values(town:String, strng:String): List<Double> {
    val townValues = strng
            .split("\n")
            .filter { it.startsWith("$town:") }

    return if (townValues.isEmpty()) emptyList()
    else townValues[0].substring(town.length + 1)
            .filter { !it.isLetter() }
            .split(",")
            .map { it.trim().toDouble() }
}
