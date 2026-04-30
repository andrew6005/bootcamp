package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank {
  private LinkedHashMap<Long, Account> accounts;

  public Bank() {
    this.accounts = new LinkedHashMap<>();
  }

  public Account getAccount(Long accountNumber) {
    return this.accounts.get(accountNumber);
  }

  public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
    Long accountNumber = Long.valueOf(this.accounts.size() + 1);
    Account account = new CommercialAccount(company, accountNumber, pin, startingDeposit);
    this.accounts.put(accountNumber, account);
    return accountNumber;
  }

  public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
    Long accountNumber = Long.valueOf(this.accounts.size() + 1);
    Account account = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
    this.accounts.put(accountNumber, account);
    return accountNumber;
  }

  public boolean authenticateUser(Long accountNumber, int pin) {
    Account account = this.accounts.get(accountNumber);

    if (account == null) {
      return false;
    }

    return account.validatePin(pin);
  }

  public double getBalance(Long accountNumber) {
    Account account = this.accounts.get(accountNumber);

    if (account == null) {
      return -1.0;
    }

    return account.getBalance();
  }

  public void credit(Long accountNumber, double amount) {
    Account account = this.accounts.get(accountNumber);

    if (account != null) {
      account.creditAccount(amount);
    }
  }

  public boolean debit(Long accountNumber, double amount) {
    Account account = this.accounts.get(accountNumber);

    if (account == null) {
      return false;
    }

    return account.debitAccount(amount);
  }
}