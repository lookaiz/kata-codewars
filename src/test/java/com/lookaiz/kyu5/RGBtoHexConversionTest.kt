package com.lookaiz.kyu5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RGBtoHexConversionTest {
    @Test
    fun `convert '255 255 255' to FFFFFF`() {
        assertEquals("FFFFFF", rgb(255, 255, 255))
    }

    @Test
    fun `convert '255 255 300' to FFFFFF`() {
        assertEquals("FFFFFF", rgb(255, 255, 300))
    }

    @Test
    fun `convert '255 255 -20' to FFFF00`() {
        assertEquals("FFFF00", rgb(255, 255, -20))
    }

    @Test
    fun `convert '0 0 0' to FFFFFF`() {
        assertEquals("000000", rgb(0, 0, 0))
    }

    @Test
    fun `convert '148 0 211' to 9400D3`() {
        assertEquals("9400D3", rgb(148, 0, 211))
    }
}
