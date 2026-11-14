package org.example.encapsulation;

public class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Suma trebuie sa fie pozitiva");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Suma trebuie sa fie pozitiva");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Fonduri insuficiente");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Cont %s: %.2f", owner, balance);
    }
}
