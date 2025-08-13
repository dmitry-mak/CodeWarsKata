package kyu6.narcissisticNumber;

import java.util.Arrays;

public class NumberUtils {
    public static void main(String[] args) {

//        System.out.println(isNarcissistic(153));
        System.out.println(testing(153));
    }

    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        String temp = Integer.toString(number);
        int[] numberArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numberArray[i] = (int) Math.pow(Character.getNumericValue(temp.charAt(i)), temp.length());
        }
        int sumOfArray = Arrays.stream(numberArray).sum();
        return number == sumOfArray;
    }

    public static int testing(int number) {
        String temp = Integer.toString(number);
        int[] numberArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numberArray[i] = (int) Math.pow(Character.getNumericValue(temp.charAt(i)), temp.length());
        }

        System.out.println(Arrays.toString(numberArray));
        int sum = Arrays.stream(numberArray).sum();
        return sum;
    }
}
