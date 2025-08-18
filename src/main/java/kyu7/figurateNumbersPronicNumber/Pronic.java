package kyu7.figurateNumbersPronicNumber;

public class Pronic {
    public static boolean isPronic(int n) {

        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n) {
                return true;
            }
        }
        return false;
    }
}
