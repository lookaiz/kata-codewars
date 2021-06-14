package com.lookaiz.kyu5;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int h = 0, m = 0, s = 0;
        h = seconds / 3600;
        int remain = seconds - h * 3600;
        if (remain > 0) {
            m = remain / 60;
            s = remain - m * 60;
        }

        return new StringBuilder()
                .append(String.format("%02d", h))
                .append(":")
                .append(String.format("%02d", m))
                .append(":")
                .append(String.format("%02d", s)).toString();
    }

    public static String makeReadable2(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);

    }
}
