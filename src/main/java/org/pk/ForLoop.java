package org.pk;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        Character[] ch = {'b', 'a', 'n', 'a', 'n', 'a' };
        List<Character> list = new ArrayList<>();

        //By using for-each loop
        for (Character item : list) {
            list.add(item);
        }
        for (Character k : ch) {
            System.out.print(k);
        }
    }
}
