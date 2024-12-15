package org.pk;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        Double[] k = {1.2, 3.5, 7.9, 8.8};

        //By using Stream API
        List<Double> stream = Arrays.stream(k).collect(Collectors.toList());

        //Print by using ListIterator interface
        ListIterator<Double> listIterator = stream.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator);
        }
    }
}
