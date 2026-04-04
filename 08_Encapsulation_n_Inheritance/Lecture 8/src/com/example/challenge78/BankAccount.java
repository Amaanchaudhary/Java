package com.example.challenge78;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    double getBalance(){
        return balance;
    }

    BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance += money;
        }
    }

    public void withDrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Withdrawl");
        } else if (money <= balance) {
            balance -= money;
            System.out.printf("Withdrawal Success, Remaining Balance is : %2f", balance);
        }else{
            System.out.println("InSufficient Balance");
        }
    }
}
