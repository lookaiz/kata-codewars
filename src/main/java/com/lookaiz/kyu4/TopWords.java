package com.lookaiz.kyu4;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TopWords {

    private static final Pattern PATTERN = Pattern.compile("[A-Za-z][A-Za-z']*");

    public static List<String> top3(String s) {
        final Map<String, Long> counts =
                PATTERN.matcher(s.trim().toLowerCase())
                        .results()
                        .collect(Collectors.groupingBy(MatchResult::group, Collectors.counting()));

        return counts.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
