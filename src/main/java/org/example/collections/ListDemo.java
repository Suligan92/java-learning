package org.example.collections;

import org.example.tasks.Task;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Task> listTasks =  new ArrayList<>();
        listTasks.add(new Task(1, "Mincare"));
        listTasks.add(new Task(2, "De spalat vesela"));
        listTasks.add(new Task(3, "Reparatie bicicleta"));
        listTasks.add(new Task(4, "Alimentez masina"));

        System.out.println(listTasks.size());
        System.out.println(listTasks.isEmpty());
        System.out.println(listTasks.contains(new Task(2, "Altceva")));
        listTasks.remove(0);
        System.out.println(listTasks);
        for (Task task : listTasks) {
            task.markDone();
            System.out.println(task);
        }
    }
}
