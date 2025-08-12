package kyu7.descendingOrder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrderKata {

    public static int sortDesc(final int num) {
        //Your code
        int result = 0;

        String numAsString = String.valueOf(num);
//        int[] numberArray = new int[numAsString.length()];

        Integer[] numberArray = new Integer[numAsString.length()];

        for (int i = 0; i < numberArray.length; i++) {
            int numberFromString = Character.getNumericValue(numAsString.charAt(i));
            numberArray[i] = numberFromString;
        }

//        Arrays.sort(numberArray);
//        int[] reversedArray = Collections.reverse(Arrays.asList(numberArray));

        Arrays.sort(numberArray, Collections.reverseOrder());
        for (int number : numberArray) {
            result = result * 10 + number;
        }
        return result;
    }


    public static void main(String[] args) {
//        sortDesc(521);
        System.out.println(sortDesc(3426819));

    }
}
