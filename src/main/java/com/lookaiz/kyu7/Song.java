package com.lookaiz.kyu7;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Song {
    private final String title;
    private final String artist;
    private final Set<String> listeners;

    public Song(String title, String artist) {
        super();
        this.title = title;
        this.artist = artist;
        listeners = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int howMany(List<String> people) {
        final int before = listeners.size();
        listeners.addAll(people);
        return listeners.size()-before;
    }
}