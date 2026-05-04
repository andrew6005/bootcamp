package com.javahongkong.bootcamp.exercise;

public class TransactionInterface {

  private long accountNumber;
  private double balance;

  public TransactionInterface(long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }


  public double getBalance() {
    return this.balance;
  }


  public void credit(double amount) {
    if (amount > 0) {
      this.balance += amount;
    }
  }


  public boolean debit(double amount) {
    if (amount > 0 && this.balance >= amount) {
      this.balance -= amount;
      return true;
    }
    return false;
  }


}