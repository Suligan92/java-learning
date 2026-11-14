package org.example.inheritance;


public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return "Persoana " + name;
    }
}
