package kyu8.returnNegative;

public class MakeNegativeKata {
    public static int makeNegative(final int x) {

        int z = x;
        if (x > 0) {
            return z = x * (-1);
        } else {
            return x;
        }
    }
}
