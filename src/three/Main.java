package three;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> catalog = new ArrayList<>();
        catalog.add(1);
        catalog.add(2);
        catalog.add(3);
        catalog.add(2);
        catalog.add(4);
        catalog.add(3);
        catalog.add(5);

        ArrayList<Integer> unique = findUnique(catalog);
        System.out.println(unique);
    }

    public static ArrayList<Integer> findUnique(ArrayList<Integer> catalog) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer num : catalog) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        return unique;
    }
}

