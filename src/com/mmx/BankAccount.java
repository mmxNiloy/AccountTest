package com.mmx;

public class BankAccount {
    // Constructors
    BankAccount() {}
    BankAccount(String developerName,
                String accountNumber,
                String accountType,
                float balance) {
        setAccountInformation(
                developerName, accountNumber,
                accountType, balance
        );
    }

    // Methods
    public void setAccountInformation(String developerName,
                                      String accountNumber,
                                      String accountType,
                                      float balance) {
        this.developerName = developerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        balance = Math.max(0.0f, balance - amount);
    }

    public void printNameAndBalance() {
        System.out.printf("Name = %s, Balance = %.2f\n", developerName, balance);
    }

    // Data fields
    private String developerName;
    private String accountNumber;
    private String accountType;
    private float balance;
}
