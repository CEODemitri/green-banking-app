package com.ceodemitri.greenbanking.model;

import java.time.LocalDateTime;
import java.util.List;

public class Account {
//    fields
    private long accountId;
    private String ownerName;
    private double balance;
    private List<Transaction> transaction;
    private LocalDateTime createdAt;

//    constructor
    public Account(long accountId, String ownerName, double initialBalance) {
    }

//    behaviors
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
