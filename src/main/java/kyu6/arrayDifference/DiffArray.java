package kyu6.arrayDifference;

import java.util.ArrayList;
import java.util.List;

public class DiffArray {
    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                result.add(a[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
