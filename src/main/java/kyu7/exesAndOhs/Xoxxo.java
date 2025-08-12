package kyu7.exesAndOhs;

public class Xoxxo {

    public static boolean getXO(String str) {

        // Good Luck!!
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.toCharArray()[i] == 'x') {
                count++;
            } else if (str.toCharArray()[i] == 'o') {
                count--;
            }
        }

        return (count == 0);
    }
}
