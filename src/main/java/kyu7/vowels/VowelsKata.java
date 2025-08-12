package kyu7.vowels;

public class VowelsKata {
    public static int getCount(String str) {

        int vowelCount = 0;
        char[] vowelLetters = {'a', 'e', 'i', 'o', 'u'};
        char[] incomingText = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            incomingText[i] = str.charAt(i);
        }

        for (char c : incomingText) {
            for (int i = 0; i < vowelLetters.length; i++) {
                if (c == vowelLetters[i]) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
}
