package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {

    public static <T> T firstOrNull(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Ion");
        List<Integer> numbers = new ArrayList<>();

        String first = firstOrNull(names);
        Integer firstNumber = firstOrNull(numbers);

        System.out.println(first);
        System.out.println(firstNumber);
    }

}
