package com.lookaiz.kyu7;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        IntSummaryStatistics stats = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return String.format("%s %s", stats.getMax(), stats.getMin());
    }

}
