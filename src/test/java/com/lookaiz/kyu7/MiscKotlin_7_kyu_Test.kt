package com.lookaiz.kyu7

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MiscKotlin_7_kyu_Test {

    @Test
    fun `Small enough - Basic Tests`() {
        assertEquals(true, smallEnough(intArrayOf(66, 101), 200))
        assertEquals(false, smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100))
        assertEquals(true, smallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107))
        assertEquals(true, smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120))
    }


    @Test
    fun `Cat mouse- Basic Tests`() {
        assertEquals("Escaped!", catMouse("C....m"))
        assertEquals("Caught!", catMouse("C..m"))
        assertEquals("Escaped!", catMouse("C.....m"))
        assertEquals("Caught!", catMouse("C.m"))
        assertEquals("Caught!", catMouse("C...m"))
    }

    @Test
    fun `ReverserLetter- Basic Tests` () {
        assertEquals("nahsirk", reverseLetter("krishan"))
        assertEquals("nortlu", reverseLetter("ultr53o?n"))
        assertEquals("cba", reverseLetter("ab23c"))
        assertEquals("nahsirk", reverseLetter("krish21an"))
    }

    @Test
    fun `FireFight- Basic Tests`() {
        assertEquals("Boat Rudder Mast Boat Hull Water ~~ Boat Deck Hull ~~ Propeller Deck ~~ Deck Boat Mast", fireFight("Boat Rudder Mast Boat Hull Water Fire Boat Deck Hull Fire Propeller Deck Fire Deck Boat Mast"))
        assertEquals("Mast Deck Engine Water ~~", fireFight("Mast Deck Engine Water Fire"))
        assertEquals("~~ Deck Engine Sail Deck ~~ ~~ ~~ Rudder ~~ Boat ~~ ~~ Captain", fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"))
    }

}