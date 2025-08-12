package kyu7.squareCheck;

public class Square {
    public static boolean isSquare(int n) {

        boolean isSquare;
        var square = (int) Math.sqrt(n);
        if (square * square == n) {
            isSquare = true;
        } else {
            isSquare = false;
        }

        return isSquare; // fix me!
    }

    public static void main(String[] args) {
        System.out.println(isSquare(36));
        System.out.println(isSquare(48));
    }
}
