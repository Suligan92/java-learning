package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        Iterator<Integer> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(listOfNumbers);

        List<Integer> listOfNumbers2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        for (int n :  listOfNumbers2) {
            if (n == 3) {
                listOfNumbers2.remove(Integer.valueOf(n));
            }
        }
        System.out.println(listOfNumbers2);

        List<Integer> listOfNumbers3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        listOfNumbers3.removeIf(n -> n == 3);
        System.out.println(listOfNumbers3);


    }
}
