package com.codurance.srp.account;

import com.codurance.srp.Clock;

public class AccountUpdater {

    private TransactionRepository transactionRepository;
    private Clock clock;

    public AccountUpdater(TransactionRepository transactionRepository, Clock clock) {
        this.transactionRepository = transactionRepository;
        this.clock = clock;
    }

    public void deposit(int amount) {
        transactionRepository.add(transactionWith(amount));
    }


    public void withdraw(int amount) {
        transactionRepository.add(transactionWith(-amount));
    }


    private Transaction transactionWith(int amount) {
        return new Transaction(clock.today(), amount);
    }


}