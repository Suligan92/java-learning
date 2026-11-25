package org.example.tasks;

import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adauga sarcina");
            System.out.println("2. Listeaza sarcinile");
            System.out.println("3. Marcheaza ca terminata");
            System.out.println("4. Sterge sarcina");
            System.out.println("5. Listeaza sortat dupa titlu");
            System.out.println("6. Listeaza nefacutele primele");
            System.out.println("7. Afiseaza o sarcina dupa id");
            System.out.println("8. Sterge sarcinile terminate");
            System.out.println("0. Iesire");
            System.out.println("Alege: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.println("Titlu: ");
                    String title = scanner.nextLine();
                    manager.add(title);
                    System.out.println("Sarcina adaugata.");
                }
                case "2" -> {
                    for (Task t : manager.getAll()) {
                        System.out.println(t);
                    }
                    System.out.println("Astea sunt toate sarcinile existente la moment.");
                }
                case "3" -> {
                    Integer id = readId(scanner);
                    if (id != null) {
                        if (manager.markDone(id)) {
                            System.out.println("Sarcina marcata.");
                        } else {
                            System.out.println("Nu exista sarcina cu acest id");
                        }
                    }
                }
                case "4" -> {
                    Integer id = readId(scanner);
                    if (id != null) {
                        if (manager.remove(id)) {
                            System.out.println("Sarcina eliminata.");
                        } else {
                            System.out.println("Nu exista sarcina cu acest id");
                        }
                    }
                }
                case "5" -> {
                    for (Task t : manager.getAllSortedByTitle()) {
                        System.out.println(t);
                    }
                }
                case "6" -> {
                    for (Task t : manager.getAllUndoneFirst()) {
                        System.out.println(t);
                    }
                }
                case "7" -> {
                    Integer id = readId(scanner);
                    if (id != null) {
                        try {
                            System.out.println(manager.getById(id));
                        } catch (TaskNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                case "8" -> {
                    int count = manager.removeDone();
                    System.out.println("Au fost sterse " + count + " sarcini.");
                }

                case "0" -> {
                    System.out.println("La revedere!");
                    return;
                }
                default -> System.out.println("Operatiune necunoscuta.");
            }
        }

    }

    public static Integer readId(Scanner scanner) {
        System.out.println("Id: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Id invalid. Id-ul trebuie sa fie un numar!");
            return null;
        }
    }
}
