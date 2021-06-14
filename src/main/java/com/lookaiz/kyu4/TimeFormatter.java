package com.lookaiz.kyu4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        Duration duration = Duration.ofSeconds(seconds);
        long days = duration.toDays();
        duration = duration.minusDays(days);
        long years = days / 365;
        days -= years * 365;
        long hours = duration.toHours();
        duration = duration.minusHours(hours);
        long minutes = duration.toMinutes();
        duration = duration.minusMinutes(minutes);
        long secs = duration.toSeconds();

        List<String> labels = new ArrayList<>();
        addLabel(labels, years, "year");
        addLabel(labels, days, "day");
        addLabel(labels, hours, "hour");
        addLabel(labels, minutes, "minute");
        addLabel(labels, secs, "second");

        String last = labels.remove(labels.size() - 1);
        return join(" and ", String.join(", ", labels), last);
    }

    private static String join(String delimiter, String e1, String e2) {
        if (isBlank(e1)) {
            return e2;
        }
        if (isBlank(e2)) {
            return e1;
        }
        return String.join(delimiter, e1, e2);
    }

    private static void addLabel(List<String> labels, long amount, String unit) {
        if (amount > 0) {
            labels.add(String.format("%s %s%s", amount, unit, amount > 1 ? "s" : ""));
        }
    }

}
