package org.example.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Task> getAllSortedByTitle() {
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparing(Task::getTitle));
        return sorted;
    }

    public List<Task> getAllUndoneFirst() {
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparing(Task::isDone).thenComparing(Task::getTitle));
        return sorted;
    }

    public Task findById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public Task getById(int id) {
        Task task = findById(id);
        if (task == null) {
            throw new TaskNotFoundException(id);
        }
        return task;
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
       return tasks.removeIf(task -> task.getId() == id);
    }

    public int removeDone() {
        int before = tasks.size();
        tasks.removeIf(Task::isDone);
        return before - tasks.size();
    }

    public void saveToFile(Path path) throws IOException {
        List<String> lines = new ArrayList<>();
        for (Task t : tasks) {
            lines.add(t.getId() + ";" + t.isDone() + ";" + t.getTitle());
        }
        Files.write(path, lines);
    }

    public void loadFromFile(Path path) throws IOException {
        tasks.clear();
        for (String line : Files.readAllLines(path)) {
            String[] parts = line.split(";");
            int id = Integer.parseInt(parts[0]);
            boolean done = Boolean.parseBoolean(parts[1]);
            String title = parts[2];

            Task task = new Task(id, title);
            if (done) {
                task.markDone();
            }
            tasks.add(task);
            nextId = Math.max(nextId, id + 1);
        }
    }



}
