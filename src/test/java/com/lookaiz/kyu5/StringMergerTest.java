package com.lookaiz.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue(StringMerger.isMerge("codewars", "code", "wars"), "codewars can be created from code and wars");
        assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"),"codewars can be created from cdwr and oeas");
        assertFalse(StringMerger.isMerge("codewars", "cod", "wars"), "Codewars are not codwars");

        assertFalse(StringMerger.isMerge("", "code", "wars"), "codewars can not be created from empty string");

        assertTrue(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"), "can handle bananas");

        assertFalse(StringMerger.isMerge("codewars", "code", "code"), "codewars is not code + code");
        assertFalse(StringMerger.isMerge("codewars", "code", "wasr"), "codewars can't be created from code and wasr");
    }
}
