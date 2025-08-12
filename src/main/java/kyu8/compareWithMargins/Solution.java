package kyu8.compareWithMargins;

public class Solution {
    public static int closeCompare(double a, double b) {
        int result;
        if (a > b) {
            result = 1;
        } else if (b > a) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public static int closeCompare(double a, double b, double margin) {
        int result = 0;
        double sum = Math.abs(a - b);
        if ((a > b) && (sum <= margin)) {
            result = 0;
        } else if ((a > b) && (sum > margin)) {
            result = 1;
        } else if ((a < b) && (sum > margin)) {
            result = -1;
        } else if ((a < b) && (sum <= margin)) {
            result = 0;
        }

        return result;
    }
}
