package org.example;

import Model.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.withdraw(200);
        account1.withdraw(1000);
    }
}