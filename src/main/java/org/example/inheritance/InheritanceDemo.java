package org.example.inheritance;

import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {


        List<Person> personList = List.of(
                new Person("Ion"),
                new Student("Ana", "USM"),
                new Teacher("Alexei", "Istoria")

        );

        for (Person p : personList) {
            System.out.println(p.describe());
        }
    }
}

