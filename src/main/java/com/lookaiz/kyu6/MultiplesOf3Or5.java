package com.lookaiz.kyu6;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {

    public int getMultiples(int n) {
        return IntStream.range(1, n).filter(i -> (i%3 == 0 || i%5 == 0)).sum();
    }


}
