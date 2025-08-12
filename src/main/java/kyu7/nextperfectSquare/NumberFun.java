package kyu7.nextperfectSquare;

public class NumberFun {
    public static long findNextSquare(long sq) {

        var square = (long) Math.sqrt(sq);
        boolean isSquare = (square * square == sq);
        long result;

        if (!isSquare) {
            return result = -1;
        } else {
            long squareOfOriginalInput = (long) Math.sqrt(sq);
            result = (long) Math.pow(squareOfOriginalInput + 1, 2);
        }

        return result;
    }
}

