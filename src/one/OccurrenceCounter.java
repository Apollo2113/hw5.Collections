package one;

import java.util.List;

public class OccurrenceCounter {
    public static int countOccurrence(List<String> catalog, String element) {
        int count = 0;
        for (String elements : catalog) {
            if (elements.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
