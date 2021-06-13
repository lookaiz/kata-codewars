package com.lookaiz.kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {
    Song song = new Song("Mount Moose", "The Snazzy Moose");
    @Test
    public void TestForTitleAndArtist() {
        assertEquals("Mount Moose", song.getTitle(), "Wrong title!");
        assertEquals("The Snazzy Moose", song.getArtist(), "Wrong artist!");
    }

    @Test
    public void TestForDataEncapsulation() {
        assertEquals(0, song.getClass().getFields().length, "Make sure that your attributes are private!");
    }

    @Test
    public void TestHowManyMethod() {
        assertEquals(5, song.howMany(new ArrayList<>(Arrays.asList("John", "Fred", "Bob", "Carl", "RyAn"))));
        assertEquals(2, song.howMany(new ArrayList<>(Arrays.asList("JoHn", "Luke", "AmAndA"))));
        assertEquals(2, song.howMany(new ArrayList<>(Arrays.asList("Amanda", "CalEb", "CarL", "Furgus"))));
        assertEquals(1, song.howMany(new ArrayList<>(Arrays.asList("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE"))));
        assertEquals(1, song.howMany(new ArrayList<>(Arrays.asList("Jack", "jacK"))));
    }

    @Test
    public void RandomTestsForTitleAndArtist() {
        for (int i = 0; i < 100; i++) {
            String s1 = getRandomString(), s2 = getRandomString();
            Song s = new Song(s1, s2);
            assertEquals(0, s.getClass().getFields().length, "Make sure that your attributes aren't accessable!");
            assertEquals(s1, s.getTitle(), "Wrong title!");
            assertEquals(s2, s.getArtist(), "Wrong artist!");
        }
    }

    @Test
    public void RandomTestsForHowMany() {
        class Check {
            private final String title;
            private final String artist;
            private final Set<String> listened = new HashSet<>();

            public Check(String title, String artist) {
                this.title = title;
                this.artist = artist;
            }

            public int howMany(ArrayList<String> names) {
                int oldLength = listened.size();
                names.forEach(name -> listened.add(name.toLowerCase()));
                return listened.size()-oldLength;
            }

            public String getTitle() {
                return title;
            }

            public String getArtist() {
                return artist;
            }
        }

        Song actual = new Song("","");
        Check expected = new Check("","");

        for (int i = 0; i < 10; i++) {
            ArrayList<String> arr = new ArrayList<>(Arrays.asList(getRandomName(),getRandomName(),getRandomName(),getRandomName(),getRandomName()));
            assertEquals(expected.howMany(arr), actual.howMany(arr));
        }

    }

    private static String getRandomString() {
        String result = "";
        String[] options = "qwertyuiopasdfghjklzxcvbnm".split("");
        for (int i = 0; i < 10; i++) {
            result += options[(int) (Math.floor(Math.random() * options.length))];
        }
        return result;
    }

    private static String getRandomName() {
        String[] names = new String[]{"ryan", "luke", "caleb", "bob", "fred", "joe", "ben", "eric", "amanda", "jesica", "syndney", "melisa"};
        String name = names[(int) (Math.floor(Math.random() * names.length))];
        int rand = (int) (Math.floor(Math.random() * 4));
        if (rand != 3) {
            String name2[] = name.split("");
            for (int i = 0; i < name2.length; i++) {
                int randomNum = (int) (Math.floor(Math.random() * 3));
                if (randomNum == 0) {
                    name2[i] = name2[i].toUpperCase();
                }
            }
            name = String.join("", name2);
        }
        return name;
    }
}