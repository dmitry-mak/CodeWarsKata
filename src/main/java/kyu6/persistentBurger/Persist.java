package kyu6.persistentBurger;

import java.util.stream.IntStream;


public class Persist {

    public static void main(String[] args) {

        int sum2 = 0;
        System.out.println(persistence(483946));

    }

    public static int persistence(long n) {

        int counter = 0;
        while (n >= 10) {
            String numberToString = Long.toString(n);
            char[] charArray = numberToString.toCharArray();
            long sum = IntStream.range(0, charArray.length)
                    .mapToLong(i -> Character.digit(charArray[i],10))
//                    .filter(value -> value != 0)
                    .reduce(1, (a, b) -> a * b);
            n = sum;
            counter++;
            System.out.println("Counter= " + counter);
            System.out.println("Sum= "+ n);
        }

        return counter;
    }
}
