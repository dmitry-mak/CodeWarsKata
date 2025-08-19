package kyu5.simplePigLatin;

import java.util.ArrayList;
import java.util.List;

public class PigLatin {

    public static String pigIt(String str) {
        String[] strToArray = str.split(" ");
        List<String> finalArray = new ArrayList<>();
        for (String s : strToArray) {
            if (s.matches("[a-zA-Z]+")) {
                char firstLetter = s.charAt(0);
                String restOfString = s.substring(1);
                String newWord = restOfString + firstLetter + "ay";
                finalArray.add(newWord);
            } else {
                finalArray.add(s);
            }
        }
        return String.join(" ", finalArray);
//        return str.replaceAll("([a-zA-Z])([a-zA-Z]*)", "$2$1ay");
    }
}
