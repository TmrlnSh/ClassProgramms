package com.java.class11;

import java.util.Scanner;

public class milana {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String destination = "USA";
        double totalSpending = sc.nextDouble();
        switch ((int) totalSpending) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Shipping cost is 5$");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Enter total spending");
                break;
            default:
                switch (destination) {
                    case "USA"://10%
                        System.out.println("Shipping cost is $ " + totalSpending * 0.1);
                    case "Canada": //15%
                        System.out.println("Shipping cost is $ " + totalSpending * 0.15);
                    case "Europe": //20%
                        System.out.println("Shipping cost is $ " + totalSpending * 0.2);
                    default: //25%
                        System.out.println("Shipping cost is $ " + totalSpending * 0.25);
                        break;
                }
        }
    }
}