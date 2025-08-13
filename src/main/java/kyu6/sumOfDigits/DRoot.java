package kyu6.sumOfDigits;

public class DRoot {
    public static int digital_root(int n) {

        int sum;
        do {
            sum = 0;
            String digitsToString = String.valueOf(n);
            int[] digitsArray = new int[digitsToString.length()];
            for (int i = 0; i < digitsToString.toCharArray().length; i++) {
                digitsArray[i] = Character.getNumericValue(digitsToString.charAt(i));
            }
            for (int digit : digitsArray) {
                sum += digit;
            }
            n = sum;
        } while (sum >= 10);
        return sum;
    }

    public static int digitalRootFromGpt(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }


    public static void main(String[] args) {
        System.out.println(digital_root(183));
    }
}
