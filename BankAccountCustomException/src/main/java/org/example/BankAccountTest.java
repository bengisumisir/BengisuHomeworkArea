package org.example;

public class BankAccountTest {
    public static void main(String[] args) {
        // Create an active account with an initial balance of 500.0 and a daily limit of 300.0
        BankAccount activeAccount = new BankAccount(500.0, 300.0, true);

        // Create an inactive account with an initial balance of 500.0 and a daily limit of 300.0
        BankAccount inactiveAccount = new BankAccount(500.0, 300.0, false);

        // 1st case: Account is inactive error
        try {
            // Trying to withdraw 100.0 from the inactive account
            inactiveAccount.withdraw(100.0);
        } catch (InactiveAccountException e) {
            // If the account is inactive, display the error message
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any unexpected errors and print the stack trace
            e.printStackTrace();
        }

        // 2nd case: Daily limit exceeded error
        try {
            // Trying to withdraw 400.0 from the active account (exceeds daily limit)
            activeAccount.withdraw(400.0);
        } catch (DailyLimitExceededException e) {
            // If the withdrawal exceeds the daily limit, display the error message
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any unexpected errors and print the stack trace
            e.printStackTrace();
        }

        // 3rd case: Insufficient funds error
        try {
            // Trying to withdraw 600.0 from the active account (insufficient funds)
            activeAccount.withdraw(600.0);
        } catch (InsufficientFundsException e) {
            // If there are insufficient funds, display the error message
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any unexpected errors and print the stack trace
            e.printStackTrace();
        }

        // 4th case: Invalid amount error (negative value)
        try {
            // Trying to withdraw -100.0 (invalid amount)
            activeAccount.withdraw(-100.0);
        } catch (InvalidAmountException e) {
            // If the withdrawal amount is invalid, display the error message
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any unexpected errors and print the stack trace
            e.printStackTrace();
        }

        // 5th case: Successful transaction
        try {
            // Trying to withdraw 200.0 from the active account (successful transaction)
            activeAccount.withdraw(200.0);
        } catch (Exception e) {
            // If any unexpected error occurs during withdrawal, print the stack trace
            e.printStackTrace();
        }
    }
}
