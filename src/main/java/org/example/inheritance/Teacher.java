package org.example.inheritance;

public class Teacher extends Person {
    private final String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public String describe() {
        return super.describe() + ", profesor de " + subject;
    }
}
