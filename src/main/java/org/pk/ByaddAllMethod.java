package org.pk;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ByaddAllMethod {
    public static void main(String[] args) {
        String[] str = {"Mango", "Banana", "Apple"};

        //By using addAll() method
        Set<String> set = new HashSet<>();
        Collections.addAll(set,str);

        //by using for-each
        for (String k : set) {
            System.out.print(k + " ");
        }
    }
}
