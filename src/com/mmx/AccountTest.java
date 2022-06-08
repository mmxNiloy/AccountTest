package com.mmx;

import java.util.Random;

public class AccountTest {

    public static void main(String[] args) {
        // Hardcoded values
        String[] names = {"A", "B", "C", "D", "E"};
        float[] vals = {1000, 400, 3141, 1234, 42069};
        float[] wds = {700, 300, 900, 400, 690};

        // [Experiment 1: Without using a parameterized constructor]
        System.out.println("Experiment 1: Without using a parameterized constructor\n");
        BankAccount[] accounts = new BankAccount[5];
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println();
            accounts[i] = new BankAccount();
            accounts[i].setAccountInformation(
                    "Test " + names[i], "", "",
                    vals[i]
            );

            accounts[i].printNameAndBalance();
            accounts[i].deposit(vals[i] - wds[i]);
            accounts[i].withdraw(wds[i]);
        }


        // [Experiment 2: Using a parameterized constructor]
        System.out.println("\n\nExperiment 2: Using a parameterized constructor\n");
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println();
            accounts[i] = new BankAccount(
                    "Test " + names[i], "", "",
                    vals[i]
            );

            accounts[i].printNameAndBalance();
            accounts[i].deposit(vals[i] - wds[i]);
            accounts[i].withdraw(wds[i]);
        }
    }
}
