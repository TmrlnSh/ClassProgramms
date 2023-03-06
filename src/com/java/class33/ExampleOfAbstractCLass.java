package com.java.class33;
abstract class Bank{
    int balance;
    public abstract void displayRateOfInterest();
    public void withdraw(int amount){
        balance = balance - amount;
    }
}
class CitiBank extends Bank{
    @Override
    public void displayRateOfInterest(){
        System.out.println("5.0");
    }
}
class ChaseBank extends Bank{
    @Override
    public void displayRateOfInterest(){
        System.out.println("6.0");
    }
}
public class ExampleOfAbstractCLass {
    public static void main(String[] args) {
        Bank citiBank = new CitiBank();
        Bank chaseBank = new ChaseBank();
        citiBank.displayRateOfInterest();
        chaseBank.displayRateOfInterest();
    }
}
