package com.ceodemitri.greenbanking.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
//    fields
    private long accountId;
    private String ownerName;
    private double balance;
    private List<Transaction> transactions;
    private final LocalDateTime createdAt;

//    constructor
    public Account(long accountId, String ownerName, double initialBalance) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = initialBalance >= 0 ? initialBalance : 0.0;
        this.createdAt = LocalDateTime.now();
        this.transactions = new ArrayList<>();
    }

//    getters and setters
    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public double getBalance() {
        return balance;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    // behavior
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be larger than 0.");
            return;
        }

        balance += amount;
        Transaction t = new Transaction(accountId, "DEPOSIT", amount, balance);
        transactions.add(t);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be larger than 0.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds, deposit now.");
            return;
        }
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

//    formatted account summary
    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", createdAt=" + createdAt +
                ", transactions=" + transactions.size() +
                '}';
    }
}
