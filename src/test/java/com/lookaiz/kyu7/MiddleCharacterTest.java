package com.lookaiz.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleCharacterTest {

    @Test
    public void evenTests() {
        assertEquals("es", MiddleCharacter.getMiddle("test"));
        assertEquals("dd", MiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleCharacter.getMiddle("testing"));
        assertEquals("A", MiddleCharacter.getMiddle("A"));
    }
}
