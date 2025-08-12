package kyu8.sumOfPositive;

import java.util.Arrays;

public class Positive {

    public static int sum(int[] arr){
     for (int i =0; i< arr.length; i++){
         if (arr[i] <0){
             arr[i]=0;
         }
     }
     int sum = Arrays.stream(arr).sum();
        return sum;
    }
}
