package kyu8.removeChars;

import java.util.Arrays;

public class RemoveCharsKata {
    public static String remove(String str) {

        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        char[] modifiedArray = Arrays.copyOfRange(chars, 1, chars.length - 1);
        // your code here
        String resultString = new String(modifiedArray);
        return resultString;
    }

    public static String removeCodeWarVersion (String str){
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        remove("Test");
        System.out.println(remove("Test"));
        System.out.println(remove("World"));
        System.out.println(removeCodeWarVersion("Another"));
        System.out.println(removeCodeWarVersion("BigTest"));

    }
}
