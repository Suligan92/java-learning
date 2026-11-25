package org.example.tasks;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(int id) {
        super("Nu exista sarcina cu id " + id);
    }


}
