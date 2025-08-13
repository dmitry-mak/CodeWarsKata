package kyu6.takeATenMinuteWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int xAxis = 0;
        int yAxis = 0;

//        if (walk.length > 10) {
        if (walk.length != 10) {

            return false;
        }

        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') {
                xAxis++;
            } else if (walk[i] == 'e') {
                yAxis++;
            } else if (walk[i] == 's') {
                xAxis--;
            } else if (walk[i] == 'w') {
                yAxis--;
            }

        }

        return yAxis == 0 && xAxis == 0;
    }

    public static boolean isValidButShorter(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0, y = 0;
        for (char c: walk) {
            switch (c) {
                case 'n': y++; break;
                case 's': y--; break;
                case 'w': x++; break;
                case 'e': x--; break;
            }
        }

        return x == 0 && y == 0;
    }
}
