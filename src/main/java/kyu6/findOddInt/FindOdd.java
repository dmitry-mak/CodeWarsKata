package kyu6.findOddInt;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;

        Map<Integer, Integer> arrayElements = new HashMap<>();

        for (int element : a) {
            arrayElements.put(element, arrayElements.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : arrayElements.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd = entry.getKey();
            }
        }
        return odd;
    }


}
