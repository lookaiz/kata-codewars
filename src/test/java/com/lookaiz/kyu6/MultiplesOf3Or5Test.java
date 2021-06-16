package com.lookaiz.kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplesOf3Or5Test {

    @Test
    public void test() {
        Assertions.assertEquals(23, new MultiplesOf3Or5().getMultiples(10));
    }

}
