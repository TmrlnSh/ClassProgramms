package com.java.class31;
//PayPal will have to create different methods for bank to take an object of each bank
//as an argument, so if we have 100 banks, we need create 100 different methods for each bank
//to support one feature

//We can take reference of parent class, so we can store object of any bank
//so we don't need to create method for each class separately
public class Paypal {
    void displayRateOfInterest(Bank bank){
        bank.displayRateOfInterest();
    }
}
