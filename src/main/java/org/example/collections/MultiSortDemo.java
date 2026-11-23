package org.example.collections;

import org.example.tasks.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MultiSortDemo {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Tema"));
        tasks.add(new Task(2, "Antrenament"));
        tasks.add(new Task(3, "Cumparaturi"));
        tasks.add(new Task(4, "Antrenament"));
        tasks.add(new Task(5, "Banca"));

        tasks.get(1).markDone();   // sarcina cu id 2
        tasks.get(4).markDone();   // sarcina cu id 5

        tasks.sort(Comparator.comparing(Task::isDone).thenComparing(Task::getTitle));
        System.out.println(tasks);

        tasks.sort(Comparator.comparing(Task::getTitle).thenComparing(Task::getId));
        System.out.println(tasks);

        tasks.sort(Comparator.comparing(Task::getTitle).reversed());
        System.out.println(tasks);
    }

}
