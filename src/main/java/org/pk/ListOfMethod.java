package org.pk;

import java.util.List;

public class ListOfMethod {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        // By using List.of() method
        List<Integer> list = List.of(arr);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
