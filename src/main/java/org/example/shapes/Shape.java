package org.example.shapes;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String describe() {
        return String.format("%s: arie %.2f, perimetru %.2f", name, area(), perimeter());
    }


}
