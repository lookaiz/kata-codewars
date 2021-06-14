package com.lookaiz.kyu5;

public class TrailingZeros {
    public static int zeros(int n) {

        int count = 0;

        // Keep dividing n by powers of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }
}
