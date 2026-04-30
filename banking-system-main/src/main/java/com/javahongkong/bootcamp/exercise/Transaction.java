package com.javahongkong.bootcamp.exercise;

public class Transaction {
  private Long accountNumber;
  private Bank bank;

  public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
    if (!bank.authenticateUser(accountNumber, attemptedPin)) {
      throw new Exception("Account validation failed.");
    }

    this.bank = bank;
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return this.bank.getBalance(this.accountNumber);
  }

  public void credit(double amount) {
    this.bank.credit(this.accountNumber, amount);
  }

  public boolean debit(double amount) {
    return this.bank.debit(this.accountNumber, amount);
  }
}