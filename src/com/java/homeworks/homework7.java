package com.java.homeworks;

import java.util.Scanner;

public class homework7 {
    // Get salary and age from user
// 1. If age is less than 18 then print you're not eligible
// 2. If age is more than or equal 18 and salary is less than 5000
// then print 'Sorry, you need work hard to get credit card'
// 3. If age is more than or equal 18 and salary is greater than
// or equal 5000 then print you're eligible
// 4. If age is more than or equal 18 and salary is greater than
// or equal to 20000 then print you'll get free credit card


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int age = 0;
//        int salary = 0;
//
//        System.out.println("Eligibility for get credit card\n" +
//                "Enter your age:");
//        age = input.nextInt();
//
//        if (age < 18) {
//            System.out.println("You're not eligible.");
//        }else{
//            System.out.println("Enter your salary:");
//            salary = input.nextInt();
//            if (salary<5000) {
//                System.out.println("Sorry, you need work hard to get credit card.");
//            }
//            else if (salary>=20000) {
//                System.out.println("You'll get free credit card.");
//            }
//            else if (salary>=5000) {
//                System.out.println("You're eligible.");
//            }
//        }





//       /**Write a program to find the greatest number out of three numbers using nested if statement*/
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        System.out.println("Enter 3 random numbers for finding the greatest one:");
//        num1 = input.nextInt();
//        num2 = input.nextInt();
//        num3 = input.nextInt();
//        if (num1>num2 && num2>=num3) {
//            System.out.println("Number " +num1+ " is greater.");
//        } else if (num2>num1 && num1>=num3) {
//            System.out.println("Number " +num2+ " is greater.");
//        } else {
//            System.out.println("Number " +num3+ " is greater.");
//        }


        /**Write a program to get a salary, age, and loan amount from the user and print
        how much credit card limit they can avail, based on the following criteria**/


        System.out.println("Check your credit card limit. \n"+"Enter your age:");
        int age = input.nextInt();
        if (age<18) {
            System.out.println("Sorry, you're not eligible.");
        }else{
            System.out.println("Enter your salary:");
            int salary = input.nextInt();
            System.out.println("Enter loan amount:");
            int loanAmount = input.nextInt();
            if (salary<1000){
                System.out.println("Not eligible.");
            } else if (salary>1000 && salary<=5000) {
                System.out.println("Limit 10 000.");
            } else if (salary>5000&&salary<=10000) {
                System.out.println("Limit 20 000.");
            }else{
                System.out.println("Limit 50 000.");
            }
            if (loanAmount<5000){
                System.out.println("No Deduction In Limit.");
            } else if (loanAmount>20000) {
                System.out.println("Not Eligible");
            }else if (loanAmount>5000&&loanAmount<=20000){
                System.out.println("Deduct Half Of The Loan Amount From Credit Card Limit.");
            }
        }
    }
}
