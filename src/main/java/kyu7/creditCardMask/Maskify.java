package kyu7.creditCardMask;

public class Maskify {
    public static String maskify(String str) {
//        throw new UnsupportedOperationException("Unimplemented");
        StringBuilder result = new StringBuilder();
        String[] symbols = str.split("");

        if (symbols.length <= 4) {
            return str;
        } else {
            for (int i = 0; i < symbols.length - 4; i++) {
                symbols[i] = String.valueOf('#');
            }
            for (String numbers : symbols) {
                result.append(numbers);
            }
            return result.toString();
        }
    }
}

