package kyu6.tribonacciSequence;

import java.util.ArrayList;
import java.util.Arrays;

public class Xbonacci {

    public static void main(String[] args) {

//        Xbonacci xbonacci = new Xbonacci();

//        double[] s = {0, 1, 1};
//        int n = 10;

//        xbonacci.tribonacci(s, n);

    }

    public double[] tribonacci(double[] s, int n) {

        if (n == 0) {
            return new double[0];
        } else if (n <= s.length) {
            double[] shortArray = new double[n];
            for (int i = 0; i < n; i++) {
                shortArray[i] = s[i];
            }
            return shortArray;
        }

        ArrayList<Double> temporaryArray = new ArrayList<>();
        for (double value : s) {
            temporaryArray.add(value);
        }

        while (temporaryArray.size() < n) {
            double newLastElement = temporaryArray.get(temporaryArray.size() - 1) + temporaryArray.get(temporaryArray.size() - 2) + temporaryArray.get(temporaryArray.size() - 3);
            temporaryArray.add(newLastElement);
        }

        double[] result = new double[temporaryArray.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temporaryArray.get(i);
        }

        System.out.println(Arrays.toString(result));

        return result;
    }
}
