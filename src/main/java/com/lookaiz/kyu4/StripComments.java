package com.lookaiz.kyu4;

import java.util.stream.Collectors;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        return text.lines().map(s -> removeAfterComment(s, commentSymbols)).collect(Collectors.joining("\n"));
    }

    private static String removeAfterComment(String text, String[] commentsSymbols) {
        if (isNotBlank(text)) {
            for (String symbol : commentsSymbols) {
                int idx = text.indexOf(symbol);
                if (idx != -1) {
                    text = text.substring(0, idx);
                }
            }
        }
        return text.stripTrailing();
    }
}
