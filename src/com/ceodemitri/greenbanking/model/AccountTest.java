package com.ceodemitri.greenbanking.model;

public class AccountTest {
    public static void main(String[] args) {
        // new account
        Account account = new Account(1001527605L, "Patrice Liza", 5000.00);
        System.out.println("Created Account: " + account);

        // test check balance
        System.out.println("\n--- Testing Checking of the Balance ---");
        System.out.println("Current balance: " + account.getBalance());

        // test deposit
        System.out.println("\n--- Testing Deposit ---");
        account.deposit(1500.00);
        System.out.println("After deposit, balance: " + account.getBalance());

        // test withdrawal
        System.out.println("\n--- Testing Withdrawal ---");
        account.withdraw(200.00);
        System.out.println("After withdrawal, balance: " + account.getBalance());

        // test invalid operations
        System.out.println("\n--- Testing Invalid Operations ---");
        account.deposit(-50.00);     // should reject
        account.withdraw(10000.00);  // should reject

        // test print transaction history
        System.out.println("\n--- Transaction History ---");
        account.getTransactions().forEach(System.out::println);
    }
}
