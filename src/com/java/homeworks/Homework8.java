package com.java.homeworks;

import java.util.Scanner;

public class Homework8 {

    /**An online shopping website uses a nested if statement to determine the shipping
    cost for an order based on the weight of the order and the shipping destination.
    Take user inputs for:
    double weight, destination.
    If the weight of the order is less than 2 lbs and the shipping destination is within the United States,
    the shipping cost is $5.
    If the weight of the order is 2 lbs or more and the shipping destination is within the United States,
    the shipping cost is calculated based on the weight of the order. users pay 50 cents per lbs.
    If the shipping destination is outside the United States, the shipping cost is calculated based on
    the weight of the order at special rate. $1.5 per lbs.*/
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter weight of your order in lbs:");
        double weight = sc.nextDouble();

        sc.nextLine();

        System.out.println("Please enter shipping country:");
        String country = sc.nextLine();

        double shippingCost;
        if (country.equalsIgnoreCase("United States")){
            if (weight<2){
                shippingCost=5;
            }else{
                shippingCost = weight*0.5;
            }
        }else {
            shippingCost = weight*1.5;
        }
        System.out.println("Your shipping cost is $"+shippingCost);
    }
}
