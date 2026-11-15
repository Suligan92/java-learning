package org.example.collections;

import org.example.tasks.Task;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Task> tasksById = new HashMap<>();
        tasksById.put(1, new Task(1,"De cumparat piine"));
        tasksById.put(2, new Task(2,"Temele de acasa"));
        tasksById.put(3, new Task(3,"Colectii Java"));

        System.out.println(tasksById.get(2));
        System.out.println(tasksById.get(99));

        for (Task t : tasksById.values()) {
            System.out.println(t);
        }
    }
}
