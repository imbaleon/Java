package com.imbaleon;

/**
 * Created by Leon on 4/9/17.
 */
public class BankAccount {
    private String customerName;
    private int accountNumber;
    private double balance;
    private String email;
    private String phoneNumber;

    public BankAccount(){

        System.out.println("the empty constructor called");
    }
    public BankAccount(String customerName,int accountNumber,double balance, String email, String phoneNumber){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {

        return this.customerName;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("New Balance: " + this.balance);
    }
    public void withdrawFunds(double amount){
        if (this.balance < amount){
            System.out.println("You don't have enough money to withdraw " + amount);
        }else{
            this.balance -=amount;
            System.out.println("New balance: " + this.balance + " you withdraw " + amount);
        }

    }
}
