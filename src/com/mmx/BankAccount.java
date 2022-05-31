package com.mmx;

public class BankAccount {
    // Constructors

    public BankAccount(String developerName, Long accountNumber,
                       String accountType, Float balance) {
        this.developerName = developerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public BankAccount() {

    }

    // Getters and setters

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    // Methods

    public void initializeAccount(String developerName, Long accountNumber,
                                  String accountType, Float balance) {
        this.developerName = developerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void depositBalance(Float amount) {
        balance = balance + amount;
    }

    public void withdrawFromBalance(Float amount) {
        // You cannot withdraw more than your current balance
        balance = Math.max(0, balance - amount);
    }

    @Override
    public String toString() {
        return String.format("BankAccount: { name: %s, balance: $%.2f }",
                developerName, balance);
    }

    // Data fields

    private String developerName;
    private Long accountNumber;
    private String accountType;
    private Float balance;
}
