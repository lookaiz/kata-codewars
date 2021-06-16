package com.lookaiz.kyu6;

import java.util.Arrays;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> list2 = Arrays.asList(array2);
        return Arrays.stream(array1)
                .filter(s -> list2.stream().anyMatch(s2 -> s2.contains(s)))
                .sorted()
                .toArray(String[]::new);
    }
}
