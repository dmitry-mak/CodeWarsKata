package kyu6.whoiLikesIt;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {

//        StringBuilder builder = new StringBuilder();
        int count = names.length - 2;
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (names.length > 3) {
            return names[0] + ", " + names[1] + " and " + count + " others like this";
        }

        return "";
    }

    public static String whoLikesItWithStream(String... names) {

        return Stream.of(names)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    int size = list.size();
                    return size == 0 ? "no one likes this"
                            : size == 1 ? list.get(0) + " likes this"
                            : size == 2 ? String.join(" and ", list) + " like this"
                            : size == 3 ? String.join(", ", list.subList(0, 2)) + " and " + list.get(2) + " like this"
                            : list.get(0) + ", " + list.get(1) + " and " + (size - 2) + " others like this";
                }));
    }

    public static String whoLikesItWithSwitch(String... names) {

        StringBuilder builder = new StringBuilder();
        switch (names.length) {
            case 0:
                builder.append("no one likes this");
                break;
            case 1:
                builder.append(names[0]).append(" likes this");
                break;
            case 2:
                builder.append(names[0]).append(" and ").append(names[1]).append(" like this");
                break;
            case 3:
                builder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this");
                break;
            default:
                builder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names.length - 2).append(" others like this");
                break;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
//        whoLikesIt("DDD", "XXX", "MMM");
        System.out.println(whoLikesItWithSwitch("DDD", "XXX", "MMM"));

    }
}
