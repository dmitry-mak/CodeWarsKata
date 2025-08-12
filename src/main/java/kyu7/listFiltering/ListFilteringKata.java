package kyu7.listFiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilteringKata {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> resultList = new ArrayList<>();

        for (Object obj : list) {
            if (!(obj instanceof String)) {
                resultList.add((Integer) obj);
            }
        }
        return resultList;
    }


}
