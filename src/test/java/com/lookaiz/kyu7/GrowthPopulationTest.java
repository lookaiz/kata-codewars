package com.lookaiz.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrowthPopulationTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        testing(GrowthPopulation.nbYear(1500, 5, 100, 5000),15);
        testing(GrowthPopulation.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(GrowthPopulation.nbYear(1500000, 0.25, 1000, 2000000), 94);
        testing(GrowthPopulation.nbYear(1500000, 0, 10000, 2000000), 50);
    }
}
