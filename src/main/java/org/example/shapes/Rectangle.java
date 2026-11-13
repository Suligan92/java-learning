package org.example.shapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Dreptunghi");
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }


}

