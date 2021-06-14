package com.lookaiz.kyu6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {

    // Solution 1
    public static String order(String words) {
        if (words == null || words.length() == 0) {
            return "";
        }

        Map<Integer, String> splitted = Stream.of(words.split(" ")).collect(
                Collectors.toMap(
                        s -> Integer.parseInt(s.replaceAll("[^0-9]", "")),
                        Function.identity()));

        return String.join(" ", new TreeMap<>(splitted).values());
    }

    // Solution 2
    public static String order2(String words) {
        return Stream.of(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.parseInt(s.replaceAll("[^0-9]", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }

    // Solution 3
    public static String order3(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.parseInt(s.replaceAll("[^0-9]", ""))))
                .collect(Collectors.joining(" "));
    }

}
