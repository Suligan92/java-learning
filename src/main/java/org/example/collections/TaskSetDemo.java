package org.example.collections;

import org.example.tasks.Task;

import java.util.HashSet;
import java.util.Set;

public class TaskSetDemo {
    public static void main(String[] args) {
        Set<Task> tasks = new HashSet<Task>();
//        tasks.add(new Task(1, "Invata Java"));
//        tasks.add(new Task(1, "Invata Java"));
//        System.out.println(tasks.size());
//
//
//        Task a = new Task(1, "Învață Java");
//        Task b = new Task(2, "Învață Java");
//        System.out.println(a == b);
//        System.out.println(a.equals(b));

        Task a = new Task(1, "Învață Java");
        Task b = new Task(1, "Altceva");
        System.out.println(a.equals(b));   // așteptat: true (același id, titlu diferit)

        Task c = new Task(2, "Învață Java");
        System.out.println(a.equals(c));   // așteptat: false (id diferit, același titlu)
    }
}
