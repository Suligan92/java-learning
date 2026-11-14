package org.example.equality;

import java.util.HashSet;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        HashSet<Point> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println(set.size());
    }
}
