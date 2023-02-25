package com.java.class29;

import java.util.zip.CheckedInputStream;

class Bank {
    void displayRateOfInterests() {
        System.out.println("4.0%");
    }
}

class ChaseBank extends Bank {
    void displayRateOfInterests() {
        System.out.println("6.0%");
        super.displayRateOfInterests();
    }
}

public class ThisAndSuperWithMethods {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.displayRateOfInterests();

    }
}
