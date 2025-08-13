package kyu6.yourOrderPlease;

public class Order {

    public static void main(String[] args) {
        order("is2 Thi1s T4est 3a");
    }

    public static String order(String words) {
        // ...
        String[] wordsArray = words.split(" ");
        String[] resultWordArray = new String[wordsArray.length];
        if (words == "") {
            return null;
        } else {
            for (int i = 0; i < wordsArray.length; i++) {
                for (int j = 0; j < wordsArray.length; j++) {
                    if (wordsArray[j].contains(String.valueOf(i + 1))) {
                        resultWordArray[i] = wordsArray[j];
                        break;
                    }
                }
            }
            return String.join(" ", resultWordArray);
        }
    }
}
