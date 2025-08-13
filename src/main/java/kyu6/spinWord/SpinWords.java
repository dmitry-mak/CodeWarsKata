package kyu6.spinWord;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                StringBuilder builder = new StringBuilder();
            builder.append(words[i]);
            words[i]= builder.reverse().toString();
            }
        }
        return String.join(" ",words);
    }

    public static String spinWithStream (String s){

        return Arrays.stream(s.split(" "))
            .map(word -> word.length()>=5 ? new StringBuilder(word).reverse().toString():word)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Welcome welcome welcome"));
    }
}
