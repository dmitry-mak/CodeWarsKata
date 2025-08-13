package kyu6.findOutlier;

import static java.util.Arrays.stream;

public class FindOutlier {
    static int find(int[] integers) {

        int evenCount = 0;
        int oddCount = 0;
        int result = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (evenCount > oddCount) {
                result = stream(integers).filter(number -> number % 2 != 0).findFirst().orElse(-1);
            } else {
                result = stream(integers).filter(number -> number % 2 == 0).findFirst().orElse(-1);
            }
        }
        return result;
    }

    static int findNew(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int number : integers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        boolean moreEvenThanOdd = evenCount > oddCount;

        return stream(integers)
                .filter(number -> moreEvenThanOdd ? number % 2 != 0 : number % 2 == 0)
                .findFirst()
                .orElse(-1);
    }
}
