package com.lookaiz.kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestWordTest {
    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort("Let's travel abroad shall we"))

        assertEquals(3, findShort2("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort2("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort2("Let's travel abroad shall we"))
    }
}