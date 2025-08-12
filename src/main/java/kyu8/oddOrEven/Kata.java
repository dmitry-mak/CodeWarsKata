package kyu8.oddOrEven;

public class Kata {
    public static String evenOrOdd(int number) {

// CodeWars simple code:
//                return (number % 2) != 0 ? "Odd" : "Even";

        String odd = "Odd";
        String even = "Even";
        if(number % 2 == 0){
            return even;
        }
        else {
            return odd;
        }
//        return ""; // Place code here;
    }
}
