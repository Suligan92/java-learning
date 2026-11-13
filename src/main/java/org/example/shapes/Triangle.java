package org.example.shapes;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        super("Triunghi");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
