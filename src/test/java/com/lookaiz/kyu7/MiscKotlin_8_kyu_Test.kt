package com.lookaiz.kyu7

import com.lookaiz.kyu8.invert
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MiscKotlin_8_kyu_Test {
    @Test
    fun testFixed() {
        assertArrayEquals(intArrayOf(-1, -2, -3, -4, -5), invert(intArrayOf(1, 2, 3, 4, 5)))
        assertArrayEquals(intArrayOf(-1, 2, -3, 4, -5), invert(intArrayOf(1, -2, 3, -4, 5)))
        assertArrayEquals(intArrayOf(), invert(intArrayOf()))
        assertArrayEquals(intArrayOf(0), invert(intArrayOf(0)))
    }
}