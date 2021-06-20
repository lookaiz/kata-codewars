package com.lookaiz.kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class Shiritori {

    public static List<String> theGame(List<String> words) {

        List<String> result = new ArrayList<>();
        int size = words.size();
        if (size == 0 || isBlank(words.get(0))) {
            return Collections.emptyList();
        }

        result.add(words.get(0));

        for (int i = 1; i < size; i++) {
            String prev = words.get(i-1);
            String current = words.get(i);

            if (isBlank(current)) break;

            if (current.charAt(0) == prev.charAt(prev.length()-1)) {
                result.add(current);
            }
            else {
                break;
            }
        }

        return result;
    }

    public static List<String> theGame2(List<String> words)  {
        return IntStream.range(0, words.size())
                .takeWhile(i -> !words.get(i).isEmpty() &&
                        (i == 0 || words.get(i).charAt(0) == words.get(i-1).charAt(words.get(i-1).length()-1)))
                .mapToObj(words::get)
                .collect(Collectors.toList());
    }

}
