package com.mmx;

import java.util.Random;

public class AccountTest {

    public static void main(String[] args) {
        // Hardcoded names
        String[] names = {"Test A", "Test B", "Test C", "Test D", "Test E"};

        // [Experiment 1]
        BankAccount[] accounts = new BankAccount[5];
        for(int i = 0 ; i < 5 ; i++) {
            accounts[i] = new BankAccount();
            accounts[i].setAccountInformation(
                    names[i], names[i], names[i],
                    (float)(i * (i + 1) * (i + 2)) / 2.0f
            );

            accounts[i].printNameAndBalance();
            accounts[i].deposit(3 * (i + 1));
            accounts[i].withdraw(5 * i);
            accounts[i].printNameAndBalance();
        }

        // [Experiment 2]
        for(int i = 0 ; i < 5 ; i++) {
            accounts[i] = new BankAccount(
                    names[i], names[i], names[i],
                    (float)(4 + 3 * i) / (float) (5 - i)
            );

            accounts[i].printNameAndBalance();
            accounts[i].deposit(3 * (i + 1));
            accounts[i].withdraw(5 * i);
            accounts[i].printNameAndBalance();
        }
    }
}
