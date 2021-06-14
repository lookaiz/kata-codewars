package com.lookaiz.kyu5;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        return validate(0, parens);
    }

    private static boolean validate(int count, String text) {
        if (count < 0) {
            return false;
        }

        if (isBlank(text)) {
            return count == 0;
        }

        if (text.startsWith("(")) {
            return validate(count+1, text.substring(1));
        }
        if (text.startsWith(")")) {
            return validate(count-1, text.substring(1));
        }
        return validate(count, text.substring(1));
    }
}
