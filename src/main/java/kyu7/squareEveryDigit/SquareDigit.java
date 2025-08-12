package kyu7.squareEveryDigit;

import java.util.Arrays;

public class SquareDigit {

    public static void main(String[] args) {
        SquareDigit firstTry = new SquareDigit();
        firstTry.squareDigits(2468);
        System.out.println(firstTry.squareDigits(2468));

    }

    public int squareDigits(int n) {
        // TODO Implement me
        int result = 0;
        String numberAsString = String.valueOf(n);
        int[] numbersArray = new int[numberAsString.length()];

        for (int i = 0; i < numbersArray.length; i++) {
            int numberFromString = Character.getNumericValue(numberAsString.charAt(i));
            numbersArray[i] = numberFromString * numberFromString;
        }

        StringBuilder builder = new StringBuilder();

        for (int num : numbersArray) {
            builder.append(num);
        }
        result = Integer.parseInt(builder.toString());
        return result;

        /*
        CODE WAR WINNING VERSION:
        return Integer.parseInt(String.valueOf(n)
                                      .chars()
                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                      .map(i -> i * i)
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining("")));
         */
    }
}
