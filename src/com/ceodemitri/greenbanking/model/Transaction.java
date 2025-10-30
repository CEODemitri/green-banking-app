package com.ceodemitri.greenbanking.model;

import java.time.LocalDateTime;

public class Transaction {
    // fields
    private static long setId = 1;

    private final long transactionId;
    private final long accountId;
    private final String type;
    private final double amount;
    private final double newBalance;
    private final LocalDateTime timestamp;

    // constructor
    public Transaction(long accountId, String type, double amount, double newBalance) {
        this.transactionId = setId++;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.newBalance = newBalance;
        this.timestamp = LocalDateTime.now();
    }

    // getters
    // transactions can't be changed once set
    public long getTransactionId() {
        return transactionId;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // clean display for transaction
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", accountId=" + accountId +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", newBalance=" + newBalance +
                ", timestamp=" + timestamp +
                '}';
    }
}
