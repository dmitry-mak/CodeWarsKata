package kyu5.countIpAddresses;

public class CountIPAddresses {
    public static void main(String[] args) {

        System.out.println(ipsBetween("192.168.1.10", "192.168.3.50"));

    }

    public static long ipsBetween(String start, String end) {

       long difference = 0;

      Long [] longStartArray = convertAndReverseArray(start);
      Long [] longEndArray = convertAndReverseArray(end);

      long startArraySum = 0;
      for(int i = 0; i < longStartArray.length; i++){
          startArraySum += longStartArray[i] * Math.pow(256, i);
      }

      long endArraySum = 0;
      for(int i = 0; i < longEndArray.length; i++){
          endArraySum += longEndArray[i] * Math.pow(256, i);
      }

      difference = endArraySum - startArraySum;
        return difference;
    }

    public static Long[] convertAndReverseArray(String number){
        String [] stringArray = number.split("\\.");
        Long [] longArray = new Long[stringArray.length];
        for (int i = 0; i < stringArray.length; i++){
            longArray[i] = Long.parseLong(stringArray[i]);
        }
        Long[] reversedArray = new Long[longArray.length];
        for (int i = 0; i < longArray.length; i++){
            reversedArray[i] = longArray[longArray.length - i - 1];
        }
        return reversedArray;
    }

}
