package kyu6.duplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word) {

        String[] wordArray = new String[word.length()];
        String[] result = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = String.valueOf(word.toLowerCase().charAt(i));
        }

        Map<String, Integer> counter = new HashMap<>();
        for (String s : wordArray) {
            counter.put(s, counter.getOrDefault(s, 0) + 1);
        }
        for (int i = 0; i < wordArray.length; i++) {
            if (counter.get(wordArray[i]) > 1) {
                result[i] = ")";
            } else {
                result[i] = "(";
            }
        }

        StringBuilder builder = new StringBuilder();
        for (String r : result) {
            builder.append(r);
        }
        String wordResult = builder.toString();


        return wordResult;
    }
}
