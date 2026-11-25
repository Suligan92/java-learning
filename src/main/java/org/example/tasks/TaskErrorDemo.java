package org.example.tasks;

public class TaskErrorDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.add("Tema");

        System.out.println(manager.getById(1));

        try {
            manager.getById(99);
        } catch (TaskNotFoundException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        manager.getById(99);
        System.out.println("final");
    }
}
