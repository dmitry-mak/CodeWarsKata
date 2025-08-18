package kyu6.simplePrimeStreaming;

public class SimplePrimeStreaming {

    public static String solve(int a, int b) {

        StringBuilder builder = new StringBuilder();
        int currentNumber = 1;
        int primeNumbersStringLength = a + b;

        while (builder.length() < primeNumbersStringLength) {
            currentNumber++;
            if (isPrime(currentNumber)) {
                builder.append(currentNumber);
            }
        }
        String primeNumbers = builder.toString();
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = (a); i <= (a + b) - 1; i++) {
            resultBuilder.append(primeNumbers.charAt(i));
        }
        String result = resultBuilder.toString();
        return result;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
