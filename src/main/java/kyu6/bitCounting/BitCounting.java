package kyu6.bitCounting;

public class BitCounting {
    public static int countBits(int n) {
        // Show me the code!
        int result = 0;
        String binaryString = Integer.toBinaryString(n);

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                result++;
            }
        }
        return result;
    }



    public static void main(String[] args) {
//        countBits(1234);
        System.out.println(countBits(1234));
    }
}
