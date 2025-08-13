package kyu6.convertingToCamelCase;



public class CamelCase {
    static String toCamelCase(String s) {

        String[] parts = s.split("[-_]");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (i == 0) {
                builder.append(parts[i]);
            } else {
                if (parts[i].length() > 0) {
                    builder.append(parts[i].substring(0, 1).toUpperCase());
                }
                if (parts[i].length() > 1) {
                    builder.append(parts[i].substring(1));
                }
            }
        }
        return builder.toString();
    }
}
