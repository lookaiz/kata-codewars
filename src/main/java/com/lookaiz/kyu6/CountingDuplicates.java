package com.lookaiz.kyu6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        Map<String, Long> counts =
                List.of(text.split("")).stream()
                        .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        return (int) counts.entrySet().stream()
                .filter(v -> v.getValue() > 1)
                .count();
    }

}
