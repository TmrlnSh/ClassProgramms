package com.java.class11;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // case or default statements can have entire switch statement inside

        //we want to write a program which  calculates shipping cost  based on
        //destination and based on total spending
        //if the customer is spending less than $5 than charge $5 for shipping
        //if spending more than $5 and less or equal to 10 then charge $10


        //if spending more than $10 then
        // we also look at the shipping destination
        //if it's USA -> charge 10% of the total spending for shipping
        //if it's Canada -> charge 15%
        //if it's Europe -> charge 20%
        //if it's other countries -> 25%

        double totalSpending;
        String country;


        System.out.println("Please enter total customer spending:");
        totalSpending = sc.nextDouble();

        if (totalSpending<0) {
            System.out.println("Invalid input");
        }else {
            switch ((int) totalSpending) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Your shipping price is $5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Your shipping price is $10");
                default:
                    System.out.println("Please enter the shipping country:");
                    country = sc.nextLine();
                    switch (country) {
                        case "USA":
                        case "United States":
                            System.out.println("Your shipping price is $" + totalSpending / 100 * 10);
                            break;
                        case "Canada":
                            System.out.println("Your shipping price is $" + totalSpending / 100 * 15);
                            break;
                        case "Europe":
                            System.out.println("Your shipping price is $" + totalSpending / 100 * 20);
                            break;
                        default:
                            System.out.println("Your shipping price is $" + totalSpending / 100 * 25);
                    }
            }
        }
    }
}
