package two;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        List<Integer> catalog = toList(arr);
        System.out.println(catalog);
    }

    public static List<Integer> toList(int[] arr) {
        List<Integer> catalog = new ArrayList<>();
        for (int i : arr) {
            catalog.add(i);
        }
        return catalog;
    }
}
