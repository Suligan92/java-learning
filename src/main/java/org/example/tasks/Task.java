package org.example.tasks;

public class Task {
    private final int id;
    private String title;
    private boolean done;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    public void markDone() {
        this.done = true;
    }

//    @Override
//    public String toString() {
//        String result = (done ? "[x] 1: Invata Java" : "[ ] 1: Invata Java");
//        return result;
//    }

    @Override
    public String toString() {
        return String.format("[%s] %d: %s", done ? "x" : " ", id, title);
    }


}
