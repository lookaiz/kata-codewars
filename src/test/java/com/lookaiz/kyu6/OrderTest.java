package com.lookaiz.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void test1() {
        assertEquals(Order.order("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est");
        assertEquals(Order.order2("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est");
        assertEquals(Order.order3("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est");
    }

    @Test
    public void test2() {
        assertEquals(Order.order("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
        assertEquals(Order.order2("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
        assertEquals(Order.order3("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
    }

    @Test
    public void test3() {
        assertEquals(Order.order(""), "", "Empty input should return empty string");
        assertEquals(Order.order2(""), "", "Empty input should return empty string");
        assertEquals(Order.order3(""), "", "Empty input should return empty string");
    }

}
