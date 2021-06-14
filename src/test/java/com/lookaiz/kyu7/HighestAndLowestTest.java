package com.lookaiz.kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestAndLowestTest {
    @Test
    public void someTest() {
        assertEquals("542 -214", HighestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    @Test
    public void sortTest() {
        assertEquals(HighestAndLowest.highAndLow("10 2 -2 -10"), "10 -10");
    }

    @Test
    public void plusMinusTest() {
        assertEquals(HighestAndLowest.highAndLow("1 -1"), "1 -1");
    }

    @Test
    public void plusPlusTest() {
        assertEquals(HighestAndLowest.highAndLow("1 1"), "1 1");
    }

    @Test
    public void minusMinusTest() {
        assertEquals(HighestAndLowest.highAndLow("-1 -1"), "-1 -1");
    }

    @Test
    public void plusMinusZeroTest() {
        assertEquals(HighestAndLowest.highAndLow("1 -1 0"), "1 -1");
    }

    @Test
    public void plusPlusZeroTest() {
        assertEquals(HighestAndLowest.highAndLow("1 1 0"), "1 0");
    }

    @Test
    public void minusMinusZeroTest() {
        assertEquals(HighestAndLowest.highAndLow("-1 -1 0"), "0 -1");
    }

    @Test
    public void singleTest() {
        assertEquals(HighestAndLowest.highAndLow("42"), "42 42");
    }

    private static final int NUM_RANDOM_TESTS = 10;
    private static final int MAX_X = 1000;

    @Test
    public void randomTest()
    {
        Random r = new Random();

        for(int i = 0; i < NUM_RANDOM_TESTS; i++)
        {
            ArrayList<Integer> numbers = new ArrayList<Integer>();

            for(int o = 0; o < r.nextInt(10) + 5; o++)
                numbers.add(r.nextInt(MAX_X * 2) - MAX_X);

            String s = numbers.get(0).toString();
            for(int o = 1; o < numbers.size(); o++) {
                s += " " + numbers.get(o).toString();
            }

            assertEquals(Collections.max(numbers) + " " + Collections.min(numbers), HighestAndLowest.highAndLow(s));
        }
    }
}
