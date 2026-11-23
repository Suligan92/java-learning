package org.example.collections;

import org.example.tasks.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(3, "Cumparaturi"));
        tasks.add(new Task(1, "Tema"));
        tasks.add(new Task(2, "Antrenament"));

        Collections.sort(tasks);
        System.out.println(tasks);

        tasks.sort(Comparator.comparing(Task::getTitle));
        System.out.println(tasks);
    }
}
