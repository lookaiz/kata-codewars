package com.lookaiz.kyu8;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseWords {

    public static String reverseWords(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        List<String> reverse = new ArrayList<>(list.size());
        new LinkedList<>(list)
                .descendingIterator()
                .forEachRemaining(reverse::add);

        return String.join(" ", reverse);
    }

    public static String reverseWords2(String str) {
        return StringUtils.reverseDelimited(str, ' ');
    }

    public static String reverseWords3(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static String reverseWords4(String str){
        return Arrays.stream(str.split(" ")).reduce((x, y) -> y+" "+x).orElse("");
    }

}
