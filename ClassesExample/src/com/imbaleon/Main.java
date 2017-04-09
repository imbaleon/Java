package com.imbaleon;

public class Main {

    public static void main(String[] args) {

        BankAccount patrick = new BankAccount();
        BankAccount monica = new BankAccount("monica",12345,0,"abc@yahoo.com","6196427248");

        monica.depositFunds(200);
        monica.withdrawFunds(50.55);
        monica.getBalance();

        patrick.depositFunds(200);
        patrick.withdrawFunds(20001);

    }

}
