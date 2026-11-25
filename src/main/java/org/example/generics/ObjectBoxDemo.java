package org.example.generics;

public class ObjectBoxDemo {
    public static void main(String[] args) {

        ObjectBox box = new ObjectBox(5);

        String s = (String) box.get();
        System.out.println(s);
    }
}
