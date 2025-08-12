package kyu7.twoToOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        // your code
//        String result = null;
        StringBuilder result = new StringBuilder();
//        String temporaryJoinedString = String.join(s1, s2);
        String temporaryJoinedString = s1+ s2;
//        char[] characters = temporaryJoinedString.toCharArray();
//        List<Character> stringList = Arrays.stream(characters).sorted().collect(Collectors.toList());

        List<Character> stringList = temporaryJoinedString.chars()
                .distinct()
                .sorted()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
//        stringList.sort();

        for (Character c : stringList) {
            result.append(c);
        }

        return result.toString();
    }
}
