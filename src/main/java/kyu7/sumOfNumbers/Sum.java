package kyu7.sumOfNumbers;

import java.util.stream.IntStream;

public class Sum {
    public static int getSum(int a, int b) {
        //Good luck!
        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Sum.getSum(-1, 2);
        System.out.println(Sum.getSum(-1, 2));
        System.out.println(Sum.getSum(2, 2));
        System.out.println(Sum.getSum(0, -1));


    }
}
