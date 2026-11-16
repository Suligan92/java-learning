package org.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public Task add(String title) {
        Task task = new Task(nextId++, title);
        tasks.add(task);
        return task;
    }

    public List<Task> getAll() {
        return List.copyOf(tasks);
    }

    public Task findById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public boolean markDone(int id) {
        Task task = findById(id);
        if (task == null) {
            return false;
        }
        task.markDone();
        return true;
    }

    public boolean remove(int id) {
//        Task task = findById(id);
//        if (task == null) {
//            return false;
//        }
//        tasks.remove(task);
//        return true;

       return tasks.removeIf(task -> task.getId() == id);

    }


}
