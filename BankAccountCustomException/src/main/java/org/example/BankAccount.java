package org.example;

public class BankAccount {
    private double balance;
    private double dailyLimit;
    private boolean isActive;

    // Constructor
    public BankAccount(double balance, double dailyLimit, boolean isActive) {
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.isActive = isActive;
    }

    // Withdraw method
    public void withdraw(double amount) throws InactiveAccountException, InsufficientFundsException, DailyLimitExceededException, InvalidAmountException {
        // Account is inactive, throw exception
        if (!isActive) {
            throw new InactiveAccountException("Account is inactive.");
        }

        // Invalid amount (negative or zero), throw exception
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }

        // Daily limit exceeded, throw exception
        if (amount > dailyLimit) {
            throw new DailyLimitExceededException("Daily limit exceeded.");
        }

        // Insufficient funds, throw exception
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds.");
        }

        // Successful withdrawal, balance is updated
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    // Getter methods
    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }
}
