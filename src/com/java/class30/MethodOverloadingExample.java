package com.java.class30;
class Bank{
    void displayRateOfInterests(int amount){
        System.out.println(amount);
    }
    void displayRateOfInterests(String amount){
        System.out.println(amount);
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        Bank c = new Bank();
        c.displayRateOfInterests(100);
    }
}
