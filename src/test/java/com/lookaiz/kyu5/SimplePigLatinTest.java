package com.lookaiz.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplePigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
        assertEquals("elloHay orldway !", SimplePigLatin.pigIt("Hello world !"));

        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt2("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt2("This is my string"));
        assertEquals("elloHay orldway !", SimplePigLatin.pigIt2("Hello world !"));
    }
}
