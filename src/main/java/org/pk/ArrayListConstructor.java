package org.pk;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListConstructor {
    public static void main(String[] args) {
        Integer[] k = {12, 3, 4, 57, 9};
        //By using List Constructor
        Set<Integer> list = new HashSet<>(Arrays.asList(k));

        //print by using iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
