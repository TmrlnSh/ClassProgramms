package com.java.homeworks;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        1. Write a program that takes a day of the week as input (e.g., “Monday”),
//        and outputs the number of days until the next weekend (i.e., either Saturday or Sunday).
//        Use a switch statement to implement this program.
//        Sample outputs for input "Monday" would be "5" and input "Friday" would be "2"
//        int daysUntilWeekend = 0;
//        System.out.println("Please enter the weekday name:");
//        String weekday = sc.next().toUpperCase();
//            switch (weekday) {
//                case "MONDAY":
//                    daysUntilWeekend = 5;
//                    break;
//                case "TUESDAY":
//                    daysUntilWeekend = 4;
//                    break;
//                case "WEDNESDAY":
//                    daysUntilWeekend = 3;
//                    break;
//                case "THURSDAY":
//                    daysUntilWeekend = 2;
//                    break;
//                case "FRIDAY":
//                    daysUntilWeekend = 1;
//                    break;
//                case "SATURDAY":
//                    daysUntilWeekend = 1;
//                    break;
//                case "SUNDAY":
//                    daysUntilWeekend = 5;
//                    break;
//            }
//        System.out.println(daysUntilWeekend+" days before weekend");









//        2. Write a program that takes an operator (e.g., “+”, “-”, “*”, “/”) and two
//        integers as input, and outputs the result of the operation. Use a switch
//        statement to implement this program. Make sure to consider the possibility
//        of division by zero, and any other edge cases.
//        Sample outputs for input "+ 2 3" would be "5", input "/ 6 2"
//        would be "3", input "* 7 8" would be "56", if we have edge case input "/ 5 0"
//        would be "division by zero is not allowed" or similar message


        System.out.println("Enter the operator:");
        String operator = sc.next();
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        if (num2==0&&operator.equals("/")){
            System.out.println("Division by zero is not allowed. Try again.");
        }else {
            switch (operator) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Wrong operator!");
            }
        }
    }
}
