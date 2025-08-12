package kyu7.printerErrors;

import java.util.HashSet;
import java.util.Set;

public class Printer {
    public static String printerError(String s) {
        // your code

        final String[] correctElements = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
        int counter = 0;
        Set<Character> setOfCorrectElement = new HashSet<>();

        for (String element : correctElements) {
            for (char c : element.toCharArray()) {
                setOfCorrectElement.add(c);
            }
        }
        for (char c : s.toCharArray()) {
            if (!setOfCorrectElement.contains(c)) {
                counter++;
            }
        }
        return counter + "/" + s.toCharArray().length;
    }

    public static String printerErrorOptimized(String s) {
        // your code

        final char[] correctElements = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        int counter = 0;
        Set<Character> setOfCorrectElement = new HashSet<>();

        for (char element : correctElements) {
            setOfCorrectElement.add(element);
        }

        for (char c : s.toCharArray()) {
            if (!setOfCorrectElement.contains(c)) {
                counter++;
            }
        }
        return counter + "/" + s.toCharArray().length;
    }


    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
        System.out.println(printerErrorOptimized("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));

    }
}
