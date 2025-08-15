package kyu5.RgbToHexConversion;

public class RgbToHex {
    public static void main(String[] args) {
    }

    public static String rgb(int r, int g, int b) {

        StringBuilder builder = new StringBuilder();
        builder.append(hex(r));
        builder.append(hex(g));
        builder.append(hex(b));

        return builder.toString();
    }

    public static String hex(int number) {
        if (number > 255) {
            number = 255;
        } else if (number < 0) {
            number = 0;
        }
        String result = Integer.toHexString(number).toUpperCase();
        if (result.length() == 1) {
            result = "0" + result;
        }
        return result;
    }
}
