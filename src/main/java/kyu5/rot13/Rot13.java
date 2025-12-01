package kyu5.rot13;

import java.util.HashMap;
import java.util.Map;

public class Rot13 {
    public static void main(String[] args) {
        System.out.println(rot13("test"));
        System.out.println(rot13("Test"));
    }

    public static String rot13(String str) {

        Map<Integer, Character> numberToCharacter = new HashMap<>();
        Map<Character, Integer> characterToNumber = new HashMap<>();

        int i = 1;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            characterToNumber.put(letter, i);
            numberToCharacter.put(i, letter);
            i++;
        }

        StringBuilder result = new StringBuilder();

        for (char letter : str.toCharArray()) {
            boolean isOriginalLetterUpperCase = Character.isUpperCase(letter);
            letter = Character.toLowerCase(letter);
            if (characterToNumber.containsKey(letter)) {

                int currentIndex = characterToNumber.get(letter);
//                boolean isOriginalLetterUpperCase = Character.isUpperCase(letter);
                int newIndex;

                if (currentIndex + 13 <= 26) {
                    newIndex = currentIndex + 13;
                } else {
                    newIndex = currentIndex - 13;
                }

                char newLetter = numberToCharacter.get(newIndex);

                if (isOriginalLetterUpperCase) {
                    result.append(Character.toUpperCase(newLetter));
                } else {
                    result.append(numberToCharacter.get(newIndex));
                }
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }
}
