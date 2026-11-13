package org.example.shapes;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Shape> shapeList = List.of(
                new Circle(2),
                new Rectangle(3, 4),
                new Triangle(3, 4, 5)
        );

        for (Shape s : shapeList) {
            System.out.println(s.describe());
        }


    }

}
