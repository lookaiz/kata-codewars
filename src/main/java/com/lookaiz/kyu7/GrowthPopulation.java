package com.lookaiz.kyu7;

public class GrowthPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {
        return getPop(p0, percent, aug, p, 0);
    }

    private static int getPop(int currentPop, double percent, int aug, int p, int n) {
        if (currentPop >= p) {
            return n;
        }

        int newPop = currentPop + aug + (int) Math.ceil(currentPop * percent/100);
        return getPop(newPop, percent, aug, p, n+1);
    }

}
