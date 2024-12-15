package org.pk;

import java.util.Arrays;
import java.util.List;

public class ByasListmethod {
    public static void main(String[] args) {

        String[] str = {"Hyderabad", "Mumbai", "Chennai", "Bangalore"};

        // By using Arrays.asList() method
        List<String> list = Arrays.asList(str);
        for (String s : list) {
            System.out.println(s + " ");
        }

    }
}
