package com.lookaiz.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrailingZerosTest {
    @Test
    public void testZeros() {
        assertEquals(0, TrailingZeros.zeros(0));
        assertEquals(1, TrailingZeros.zeros(6));
        assertEquals(2, TrailingZeros.zeros(14));
    }
}
