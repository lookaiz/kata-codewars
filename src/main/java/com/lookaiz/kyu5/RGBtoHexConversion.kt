package com.lookaiz.kyu5

import java.util.stream.Collectors

fun rgb(r: Int, g: Int, b: Int): String? =
        listOf(r, g, b).stream()
        .map { k: Int? -> Integer.toHexString(k!!.coerceIn(0, 255))
                .toUpperCase()
                .padStart(2, '0') }
        .collect(Collectors.joining())

fun rgb2(r: Int, g: Int, b: Int) = listOf(r, g, b).joinToString("") {
    it.coerceIn(0..255).toString(16).padStart(2, '0').toUpperCase()
}
