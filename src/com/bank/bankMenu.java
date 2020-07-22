package com.bank;

public class bankMenu extends Main {
    public static double balance;
    public static double cashBalance;
    public static double withDrawAmt;
    public static double initialBalance;
    public static double initialInterest;



    public static void menu() {
        System.out.println("Welcome to XYZ Bank, " + Main.usrNamePass[0]);
        userRequests.requests();
    }



    public void SavingsAccount() {
        while(true) {
            initialBalance = 100;
            initialInterest = .03;
            System.out.println("The intial balance in your savings account is " + initialBalance + "The interest in your savings account is " + initialInterest);
        }
        }


    public void deposit() {
        while (true) {
            cashBalance = input.nextDouble();
            if (cashBalance <= 0) {
                System.out.println("You do not have enough cash to deposit");
            } else {
                balance = balance + cashBalance;
            }
        }
    }

    public void withdraw() {
        while (true) {
            System.out.println("How much would you like to withdraw??");
            withDrawAmt = input.nextDouble();
            if (withDrawAmt > balance) {
                System.out.println("You cannot withdraw more money than you have");
            } else {
                balance = balance - withDrawAmt;
                withDrawAmt = cashBalance;
            }
        }
    }

    public void addInterest() {
        while (true) {
            initialInterest = input.nextDouble();
            initialBalance = initialBalance + initialBalance * initialInterest;
        }
    }

    public double getBalance() {
        return balance;
    }

}
