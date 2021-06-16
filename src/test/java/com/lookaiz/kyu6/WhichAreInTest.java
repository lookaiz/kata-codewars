package com.lookaiz.kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhichAreInTest {

    @Test
    public void test1() {
        String[] a = new String[] { "arp", "live", "strong" };
        String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] r = new String[] { "arp", "live", "strong" };
        Assertions.assertArrayEquals(r, WhichAreIn.inArray(a, b));

//        a = new String[] {"cod", "code", "wars", "ewar", "pillow", "bed", "phht"};
//        b = new String[] {"lively", "alive", "harp", "sharp", "armstrong", "codewars"]
//        r = new String[] { "arp", "live", "strong" };
//        Assertions.assertArrayEquals(r, WhichAreIn.inArray(a, b));

    }
}
