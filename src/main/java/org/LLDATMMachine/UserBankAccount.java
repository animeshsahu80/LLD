package org.LLDATMMachine;

public class UserBankAccount {
    int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }
    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    String holderName;
    int balance;
}
