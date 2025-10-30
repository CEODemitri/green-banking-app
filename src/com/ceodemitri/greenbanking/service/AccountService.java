package com.ceodemitri.greenbanking.service;

import com.ceodemitri.greenbanking.model.Account;
import com.ceodemitri.greenbanking.model.Transaction;
import com.ceodemitri.greenbanking.repository.AccountRepository;
import com.ceodemitri.greenbanking.repository.TransactionRepository;

/**
 * Service class responsible for handling business logic related to accounts:
 * creation, deposits, withdrawals, and transfers(coming soon).
 */
public class AccountService {
    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    // constructor dependency injection
    public AccountService(AccountRepository accountRepository, TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    // basic operations
    public Account createAccount(String ownerName, double balance) {
        Account account = new Account(generateAccountID(), ownerName, balance);
        accountRepository.save(account);

        // initial transaction opening account
        if (balance > 0) {
            Transaction t = new Transaction(account.getAccountId(), "INITIAL_DEPOSIT", balance, balance);
            transactionRepository.save(t);
            account.addTransaction(t);
        }

        return account;
    }

    // deposit

    // withdraw

    // transfer (coming soon)

    private long generateAccountID() {
        return 0;
    }
}
