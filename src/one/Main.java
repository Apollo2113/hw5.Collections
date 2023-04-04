package one;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("apple");
        catalog.add("banana");
        catalog.add("orange");
        catalog.add("banana");
        catalog.add("kiwi");
        catalog.add("banana");

        String element = "banana";

        int occurrenceCount = OccurrenceCounter.countOccurrence(catalog, element);
        System.out.println("The occurrence count of " + element + " in the catalog is: " + occurrenceCount);
    }
}