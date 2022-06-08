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
        if(amount < 500.0 || amount > 1e6) {
            System.out.println(
                "The amount is " +
                (amount < 500.0 ? "too low" : "too much") +
                " to deposit!"
            );
            return;
        }

        balance += amount;
        System.out.printf("Deposit successful.\nCurrent balance $ %.2f\n", balance);
    }

    public void withdraw(float amount) {
        if(amount < 500.0 || amount > balance) {
            System.out.println(
                "The amount is " +
                (amount > balance ? "too much" : "too low") +
                " to withdraw!"
            );
            return;
        }

        balance -= amount;
        System.out.printf("Withdraw successful.\nCurrent balance $ %.2f\n", balance);
    }

    public void printNameAndBalance() {
        System.out.printf("Name = %s\nBalance = %.2f\n", developerName, balance);
    }

    // Data fields
    private String developerName;
    private String accountNumber;
    private String accountType;
    private float balance;
}
