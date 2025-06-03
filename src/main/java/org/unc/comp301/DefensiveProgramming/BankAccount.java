package org.unc.comp301.DefensiveProgramming;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        balance += amount;
    }


}
