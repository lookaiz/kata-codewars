package com.lookaiz.kyu7;

import java.util.Map;
import java.util.stream.Collectors;

public class DnaStrand {

    private static final Map<String, String> DNA =
            Map.of("A", "T", "T", "A", "C", "G", "G", "C");

    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(i -> (char) i)
                .map(c ->  DNA.get(Character.toString(c)))
                .collect(Collectors.joining(""));
    }
}
