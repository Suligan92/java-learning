package org.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskDemo {
    public static void main(String[] args) {

        Task ts = new Task(1, "Învață Java");
        System.out.println(ts);   // [ ] 1: Învață Java

        ts.markDone();
        System.out.println(ts);   // [x] 1: Învață Java

        System.out.println("/-/-/-/-/-/-/--//-/-/--/-/-/-/--/");


        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Învață Java"));
        tasks.add(new Task(2,"Fa commit pe GitHub"));
        tasks.add(new Task(3, "Citeste despre colectii"));

        for (Task t : tasks) {
            tasks.get(0).markDone();
            System.out.println(t);
        }



    }
}
