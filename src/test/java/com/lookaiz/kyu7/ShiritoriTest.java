package com.lookaiz.kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiritoriTest {

    @Test
    public void test1() {
        List<String> words = Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat");
        List<String> expected = Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat");
        Assertions.assertEquals(expected, Shiritori.theGame(words));
    }

    @Test
    public void test2() {
        List<String> words = Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc");
        List<String> expected = Arrays.asList("dog", "goose");
        Assertions.assertEquals(expected, Shiritori.theGame(words));
    }

    @Test
    public void test3() {
        List<String> words = Arrays.asList("dog", "goose", "elephant", "tiger", "cat" , "rhino", "rhino", "orc");
        List<String> expected = Arrays.asList("dog", "goose", "elephant", "tiger");
        Assertions.assertEquals(expected, Shiritori.theGame(words));

    }
    @Test
    public void TestEmpty() {
        List<String> words = new ArrayList<>();
        Assertions.assertEquals(new ArrayList<String>(), Shiritori.theGame(words));
    }

    @Test
    public void TestEStrings() {
        List<String> words = Arrays.asList("", "", "", "", "", "", "");
        Assertions.assertEquals(new ArrayList<String>(), Shiritori.theGame(words));
    }

    @Test
    public void TestMidEStrings() {
        List<String> words = Arrays.asList("ab", "bc", "", "de", "", "", "");
        List<String> expected = Arrays.asList("ab", "bc");
        Assertions.assertEquals(expected, Shiritori.theGame(words));
    }

}
