package kyu7.jadenSmithCase;


import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenSmithCase {
    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        String[] words = phrase.split(" ");
        String[] wordsCopy = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            wordsCopy[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        return String.join(" ", wordsCopy);
    }



    public static void main(String[] args) {
        System.out.println(toJadenCase("lets Try this example for da beginning"));
    }
}
