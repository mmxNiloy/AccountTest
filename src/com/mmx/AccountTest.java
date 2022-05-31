package com.mmx;

import java.util.Random;

public class AccountTest {

    public static void main(String[] args) {
        // Hardcoded data
        String[] names = {"John Doe", "Jane Doe", "Horatio Nelson", "Ivar Ragnarsson", "Radzig Kobyla"};
        String[] accountTypes = {"Personal", "Merchant"};
        Random rd = new Random();
	    // Experiment 1: Without constructor
        System.out.println("Experiment 1: Without constructor");

        System.out.println("Initialization");
        BankAccount[] accounts = new BankAccount[5];
        for(int i = 0 ; i < accounts.length ; i++) {
            accounts[i] = new BankAccount();
            accounts[i].initializeAccount(names[i],
                    makeAccountNumber(names[i]), accountTypes[i & 1],
                    (float)Math.pow(10, (int)(rd.nextFloat() * 10)) * rd.nextFloat());

            printAccount(accounts[i], i);
        }

        depositAndWithdrawDemonstration(accounts);

        // [End of Experiment 1]

        // Experiment 2: With constructor
        System.out.println("\nExperiment 2: With constructor");
        for(int i = 0 ; i < accounts.length ; i++) {
            accounts[i] = new BankAccount(
                    names[i],
                    makeAccountNumber(names[i]), accountTypes[i & 1],
                    (float)Math.pow(10, (int)(rd.nextFloat() * 10)) * rd.nextFloat()
            );

            printAccount(accounts[i], i);
        }

        depositAndWithdrawDemonstration(accounts);
        // [End of Experiment 2]
    }

    private static void depositAndWithdrawDemonstration(BankAccount[] accounts) {
        Random rd = new Random();

        System.out.println();
        System.out.println("Before and after depositing");
        for (BankAccount account : accounts) {
            System.out.println("Before depositing");
            System.out.println(account);
            account.depositBalance((float) Math.pow(10, ((int) ((rd.nextFloat() * 10)) % 5) + 1) * rd.nextFloat());
            System.out.println("After depositing");
            System.out.println(account);
            System.out.println();
        }

        System.out.println();
        System.out.println("Before and after a withdrawal");
        for (BankAccount account : accounts) {
            System.out.println("Before withdrawal");
            System.out.println(account);
            account.withdrawFromBalance((float) Math.pow(10, (int) (rd.nextFloat() * 10)) * rd.nextFloat());
            System.out.println("After withdrawal");
            System.out.println(account);
            System.out.println();
        }
    }

    private static Long makeAccountNumber(String name) {
        Long ans = 0L;
        for(int i = 0 ; i < name.length() ; i++) {
            ans += Character.getNumericValue(name.charAt(i)) % 23;
            ans *= 10;
        }
        return ans;
    }

    private static void printAccount(BankAccount account, int index) {
        System.out.printf(
                "BankAccount #%d: { name: %s, accNumber: %d, accType: %s, balance: $%.2f }%n",
                index + 1,
                account.getDeveloperName(),
                account.getAccountNumber(),
                account.getAccountType(),
                account.getBalance()
        );
    }
}
