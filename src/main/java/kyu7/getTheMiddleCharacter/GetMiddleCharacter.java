package kyu7.getTheMiddleCharacter;

public class GetMiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!

//        1. check odd or even

//        2. of odd return middle

//        3. if even return middle +1

        if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            return String.valueOf(word.charAt(word.length() / 2));
        }

//        return word;
    }
}
