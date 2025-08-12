package kyu8.reversedString;

public class ReversedStringKata {
    public static String solution(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        return builder.toString();
    }

}
