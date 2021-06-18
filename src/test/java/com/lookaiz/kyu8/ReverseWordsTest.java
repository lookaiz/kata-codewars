package com.lookaiz.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testSomething() {
        assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
        assertEquals("nice so not is world The", ReverseWords.reverseWords("The world is not so nice"));
        assertEquals("beatiful is Life", ReverseWords.reverseWords("Life is beatiful"));
        assertEquals("won! we hello Hello", ReverseWords.reverseWords("Hello hello we won!"));
    }

    @Test
    public void testSomething2() {
        assertEquals("eating like I", ReverseWords.reverseWords2("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords2("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords2("The world is nice"));
        assertEquals("nice so not is world The", ReverseWords.reverseWords2("The world is not so nice"));
        assertEquals("beatiful is Life", ReverseWords.reverseWords2("Life is beatiful"));
        assertEquals("won! we hello Hello", ReverseWords.reverseWords2("Hello hello we won!"));
    }

    @Test
    public void testSomething3() {
        assertEquals("eating like I", ReverseWords.reverseWords3("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords3("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords3("The world is nice"));
        assertEquals("nice so not is world The", ReverseWords.reverseWords3("The world is not so nice"));
        assertEquals("beatiful is Life", ReverseWords.reverseWords3("Life is beatiful"));
        assertEquals("won! we hello Hello", ReverseWords.reverseWords3("Hello hello we won!"));
    }

    @Test
    public void testSomething4() {
        assertEquals("eating like I", ReverseWords.reverseWords4("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords4("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords4("The world is nice"));
        assertEquals("nice so not is world The", ReverseWords.reverseWords4("The world is not so nice"));
        assertEquals("beatiful is Life", ReverseWords.reverseWords4("Life is beatiful"));
        assertEquals("won! we hello Hello", ReverseWords.reverseWords4("Hello hello we won!"));
    }
}
