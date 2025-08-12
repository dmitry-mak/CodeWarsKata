package kyu7.troll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrollVowelsKata {

    public static String disemvowel(String str) {
        // Code away...

        char[] charArray = str.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }

        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        charList.removeAll(vowelList);

        String modifiedStr = charList.stream().map(String::valueOf).collect(Collectors.joining());
        return modifiedStr;
    }

    public static void main(String[] args) {

        System.out.println(disemvowel("poprobujem vot na etom primere"));
    }
}
