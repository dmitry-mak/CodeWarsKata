package kyu6.multiplesOf3and5;

import java.util.stream.IntStream;

public class Multiplier {
    public static int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int solutionShort(int number) {

        return IntStream.range(0, number)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solutionShort(10));
    }
}
