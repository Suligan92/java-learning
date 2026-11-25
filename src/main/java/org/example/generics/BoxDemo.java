package org.example.generics;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> textBox = new Box<>("Salut");
        Box<Integer> numberBox = new Box<>(42);

        String s = textBox.get();
        int n = numberBox.get();
        System.out.println(s + " " + n);

        textBox.set("Java");
        System.out.println(textBox.get());
    }
}
