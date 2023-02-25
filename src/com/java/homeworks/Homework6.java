package com.java.homeworks;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        Write a program to take a day number from the user and print the name of the day from the given number

//        System.out.println("Enter number from 0 to 6:");
//        int weekNum = input.nextInt();
//        if (weekNum == 0){
//            System.out.println("Sunday");
//        } else if (weekNum == 1) {
//            System.out.println("Monday");
//        } else if (weekNum == 2) {
//            System.out.println("Tuesday");
//        } else if (weekNum == 3) {
//            System.out.println("Wednesday");
//        } else if (weekNum == 4) {
//            System.out.println("Thursday");
//        } else if (weekNum == 5) {
//            System.out.println("Friday");
//        } else if (weekNum == 6) {
//            System.out.println("Saturday");
//        }else {
//            System.out.println("Wrong entry. Only numbers 0-6 are allowed. Try again");
//        }



        //Write a program to print a welcome message to the traveler and notify them
        // of a 10% discount if they are returning customers, at the end print the
        // message “Enjoy your stay here

        System.out.println("Welcome to the Beverly Hills\n" +
                "Are you traveling first time here? (Yes/No):");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("You have got a 10% discount on your stay\n" +
                    "Enjoy your stay!");
        }else {
            System.out.println("Enjoy your stay!");
        }
    }
}
