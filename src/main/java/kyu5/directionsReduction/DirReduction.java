package kyu5.directionsReduction;

import java.util.ArrayList;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {

        List<String> directionsList = new ArrayList<>();
        for (String s : arr) {
            directionsList.add(s);
        }

        while (hasOpposite(directionsList)) {
            for (int i = 0; i < directionsList.size() - 1; i++) {
                if (areOpposite(directionsList.get(i), directionsList.get(i + 1))) {
                    directionsList.remove(i);
                    directionsList.remove(i);
                    break;
                }
            }

        }
        return directionsList.toArray(new String[0]);
    }

    public static boolean hasOpposite(List<String> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).equals("NORTH") && array.get(i + 1).equals("SOUTH")) {
                return true;
            } else if (array.get(i).equals("SOUTH") && array.get(i + 1).equals("NORTH")) {
                return true;
            } else if (array.get(i).equals("EAST") && array.get(i + 1).equals("WEST")) {
                return true;
            } else if (array.get(i).equals("WEST") && array.get(i + 1).equals("EAST")) {
                return true;
            }
        }
        return false;
    }

    public static boolean areOpposite(String first, String second) {

        return (first.equals("NORTH") && second.equals("SOUTH")) ||
                (first.equals("SOUTH") && second.equals("NORTH")) ||
                (first.equals("EAST")) && second.equals("WEST") ||
                first.equals("WEST") && second.equals("EAST");
    }
}
