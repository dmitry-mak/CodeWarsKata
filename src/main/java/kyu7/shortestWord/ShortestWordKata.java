package kyu7.shortestWord;

import java.util.Arrays;
import java.util.stream.Stream;

public class ShortestWordKata {
    public static int findShort(String s) {
        int minWordLength = Integer.MAX_VALUE;
        String[] phrase = s.split(" ");

        for (String word : phrase) {
            if (word.length() < minWordLength) {
                minWordLength = word.length();
            }
        }

        return minWordLength;
    }
}
