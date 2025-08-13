package kyu6.detectPangram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PangramChecker {
    public static void main(String[] args) {
        PangramChecker checker = new PangramChecker();
        System.out.println(checker.check("The quick brown fox jumps over the lazy dog."));
    }

    public boolean check(String sentence) {
        String[] alphabeth = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] sentenceChar = sentence.toLowerCase().replaceAll("[^a-z]", "").split("");
        List<String> charList = Arrays.asList(sentenceChar);
        Collections.sort(charList);

        List<String> distinctChatList = charList.stream().distinct().toList();


        List<String> alphabethList = Arrays.asList(alphabeth);
        Collections.sort(alphabethList);

        return alphabethList.equals(distinctChatList);
    }
}
