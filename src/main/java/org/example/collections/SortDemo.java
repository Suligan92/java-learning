package org.example.collections;

import org.example.tasks.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Task>  tasks = new ArrayList<>();
        tasks.add(new Task(1, "Mincare"));
        tasks.add(new Task(2, "Alimentez masina"));
        tasks.add(new Task(3, "Reparatie bicicleta"));
        tasks.add(new Task(4, "De spalat vesela"));

        System.out.println(tasks);
        tasks.sort(Comparator.comparing(Task::getTitle));
        System.out.println(tasks);
        tasks.sort(Comparator.comparing(Task::getTitle).reversed());
        System.out.println(tasks);

        tasks.removeIf(t -> t.getId() == 2);
        System.out.println(tasks);



    }
}
