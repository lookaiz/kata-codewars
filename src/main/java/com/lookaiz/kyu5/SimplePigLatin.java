package com.lookaiz.kyu5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimplePigLatin {

    // Solution 1
    public static String pigIt(String str) {
        return Stream.of(str.split(" ")).map(SimplePigLatin::pigify).collect(Collectors.joining(" "));
    }

    private static String pigify(String str) {
        if (str.chars().allMatch(Character::isLetterOrDigit)) {
            return String.format("%s%say", str.substring(1), str.substring(0, 1));
        }
        return str;
    }

    // Solution 2
    public static String pigIt2(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
