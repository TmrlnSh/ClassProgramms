package com.java.class31;

public class BankMain {
    public static void main(String[] args) {
        ChaseBank tamerCB = new ChaseBank();

        CitiBank tamerCiti = new CitiBank();

        Paypal tamerPaypal = new Paypal();

        tamerPaypal.displayRateOfInterest(tamerCB);
        tamerPaypal.displayRateOfInterest(tamerCiti);
    }
}
