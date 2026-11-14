package org.example.inheritance;

public class Student extends Person {
    private final String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String describe() {
        return super.describe() + ", student la " + university;
    }
}
