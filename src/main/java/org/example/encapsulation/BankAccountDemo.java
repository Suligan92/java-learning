package org.example.encapsulation;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anna");

        account.deposit(200);
        account.withdraw(50);
        System.out.println(account);

//        account.balance = 5000; // nu compilează: balance este private

        account.withdraw(1000);

    }
}
