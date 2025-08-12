package kyu7.highestAndLowest;

import java.util.Arrays;

public class HiAndLoKata {
    public static String highAndLow(String numbers) {
        // Code here or
        String[] arrayFromString = numbers.split(" ");
        int[] numbersArray = new int[arrayFromString.length];

        for (int i = 0; i < arrayFromString.length; i++) {
            numbersArray[i] = Integer.parseInt(arrayFromString[i]);
        }

        int max = Arrays.stream(numbersArray)
                .max()
                .getAsInt();

        int min = Arrays.stream(numbersArray)
                .min()
                .getAsInt();

        String result = String.format("%d %d", max, min);

        return result;

    }

    public static void main(String[] args) {
//        highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

    }
}
