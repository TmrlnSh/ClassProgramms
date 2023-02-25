package com.java.homeworks;

import java.util.Scanner;

public class homework10c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create a method that takes a boolean indicating whether someone is
        // a member of a loyalty program and a double representing the cost of
        // a purchase, and returns a double representing the final cost of the
        // purchase after applying a discount. If the customer is a loyalty customer
        // apply 10% discount.
        System.out.println("Cost of purchase:");
        double purchaseCost = sc.nextDouble();
        System.out.println("Are you member of loyalty?");
        boolean loyaltyMember = sc.nextBoolean();
        System.out.println(discount(purchaseCost,loyaltyMember));

    }
    public static double discount(double purchaseCost, boolean loyaltyMember){
        if (loyaltyMember){
            return purchaseCost*0.9;
        }else {
            return purchaseCost;
        }
    }
}
