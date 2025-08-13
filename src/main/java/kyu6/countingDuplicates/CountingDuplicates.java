package kyu6.countingDuplicates;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        int charCounter = 0;
        String[] textAsArray = new String[text.length()];

        for (int i = 0; i < text.length(); i++) {
            textAsArray[i] = String.valueOf(text.toLowerCase().charAt(i));
        }

        Map<String, Integer> counter = new HashMap<>();
        for (String s : textAsArray) {
            counter.put(s, counter.getOrDefault(s, 0) + 1);
        }
//        for (int i = 0; i < textAsArray.length; i++) {
//            if (counter.get(textAsArray[i]) > 1) {
//                charCounter++;
//            }
//        }
        for (String key : counter.keySet()) {
            if (counter.get(key) > 1) {
                charCounter++;
            }
        }
        return charCounter;
    }
}
