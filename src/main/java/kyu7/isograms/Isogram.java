package kyu7.isograms;

public class Isogram {
    public static boolean isIsogram(String str) {
        boolean isIsogram = true;

        str = str.toLowerCase();

        for (int i = 0; i < str.toCharArray().length; i++) {
            for (int j = i + 1; j < str.toCharArray().length; j++) {
                if (str.toCharArray()[i] == str.toCharArray()[j]) {
                    isIsogram = false;
                }
            }
        }
        return isIsogram;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("test"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));

    }
}
