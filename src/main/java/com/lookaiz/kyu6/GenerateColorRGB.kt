package com.lookaiz.kyu6

import java.util.Random
import kotlin.math.floor

object GenerateColorRGB {
    private const val LETTERS = "0123456789ABCDEF"

    fun generateColor(r:Random): String {
        var color = "#"
        for (i in 0..5) {
            color += LETTERS[floor(r.nextDouble() * 16).toInt()]
        }

        return color
    }

    fun generateColor2(r:Random) = String.format("#%02X%02X%02X", r.nextInt(255), r.nextInt(255), r.nextInt(255))
}
