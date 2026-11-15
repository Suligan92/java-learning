package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();
        tags.add("java");
        tags.add("spring");
        tags.add("java");
        tags.add("sql");

        System.out.println(tags.size());
        System.out.println(tags);
        System.out.println(tags.contains("spring"));
    }
}
