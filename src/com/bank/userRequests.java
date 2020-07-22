package com.bank;
import java.util.Scanner;

public class userRequests {
    public static void requests(){
        Scanner requestInput = new Scanner(System.in);
        bankMenu.balance = 0;
        bankMenu.cashBalance = 100;
        System.out.println("Here are your stats: \n Bank Balance:" + bankMenu.balance + " \n Cash Balance:" + bankMenu.cashBalance);
        System.out.println("Type: \n withdraw to withdraw money, \n deposit to deposit your cash balance, \n add interest to add interest to your bank account \n get balance to get your current balance \n savings account to view your savings account or make changes ");
        bankMenu request = new bankMenu();
        String requestinput = requestInput.next();
        if(requestinput.equals("WITHDRAW".toLowerCase())) {
            request.withdraw();
        }
        requestinput = requestInput.next();
        if(requestinput.equals("DEPOSIT".toLowerCase())){
            request.deposit();
        }
        requestinput = requestInput.next();
        if(requestinput.equals("ADD INTEREST".toLowerCase())){
            request.addInterest();
        }
        requestinput = requestInput.next();
        if(requestinput.equals("GET BALANCE".toLowerCase())){
            request.getBalance();
        }

        if(requestinput.equals("SAVINGS ACCOUNT".toLowerCase())){
            request.SavingsAccount();
        }
    }
}
