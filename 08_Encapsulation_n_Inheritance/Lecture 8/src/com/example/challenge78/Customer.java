package com.example.challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("001", "Amaan Chaudhary");
        myAcc.depositMoney(200);
        myAcc.withDrawMoney(3);
    }
}
