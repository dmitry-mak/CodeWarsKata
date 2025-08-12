package kyu7.mumbling;

import java.util.ArrayList;
import java.util.List;

public class Accumulation {
    public static String accum(String s) {
        // your code
        StringBuilder result = new StringBuilder();
        List<String> lettersList = new ArrayList<>();

        for (String letter : s.split("")) {
            lettersList.add(letter.toLowerCase());
        }
        for (int i = 0; i < lettersList.size(); i++) {
            lettersList.set(i, lettersList.get(i).toUpperCase() + lettersList.get(i).repeat(i));
        }

        for (int i = 0; i < lettersList.size(); i++) {
            result.append(lettersList.get(i));
            if (i < lettersList.size() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("TeSt"));
    }
}
