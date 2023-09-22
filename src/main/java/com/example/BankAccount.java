package com.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
        // TODO: Initialize the balance
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        // TODO: Increase the balance by the value of the amount parameter
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
        // TODO: Decrease the balance by the value of the amount parameter. 
        // Ensure that the balance does not become negative.
    }

    public double getBalance() {
        // TODO: Return the current balance
        return this.balance;  // Change this default return statement
    }
}
