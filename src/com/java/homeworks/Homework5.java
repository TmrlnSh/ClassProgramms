package com.java.homeworks;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        System.out.println("How many Java exercises are you solving per day?");
//        int exercises = input.nextInt();
//        if(exercises <3){
//            System.out.println("You're too lazy!");
//        }
//        if (exercises >=3 && exercises <5){
//            System.out.println("Good job, but you should do better!");
//        }
//        if (exercises >=5){
//            System.out.println("Great job! You're on the right track!");
//        }


//        System.out.println("Enter first number(positive):");
//        int num1 = input.nextInt();
//        System.out.println("Enter second number(positive);");
//        int num2 = input.nextInt();
//        System.out.println("Enter third number(positive):");
//        int num3 = input.nextInt();
//
//        int average = (num1+num2+num3)/3;
//        System.out.println("Average number is "+average);


        System.out.println("Welcome to the Delta Air Lines!");
        System.out.println("Are you travelling from connecting flight(Yes/No)?");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println
                    ("Please proceed to the security check and\n" +
                    "Enjoy your flight");
        }
        else {
            System.out.println("Enjoy your flight");
        }
    }
}
