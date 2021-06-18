package com.lookaiz.kyu6;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOdd {
    public static int findIt(int[] a) {
        List<Integer> ints = IntStream.of(a).boxed().collect(Collectors.toList());
        return IntStream.of(a)
                .boxed()
                .filter(i -> Collections.frequency(ints, i) % 2 != 0)
                .distinct()
                .findFirst()
                .get();
    }
}
