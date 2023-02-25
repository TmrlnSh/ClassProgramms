package com.java.class07;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        if(age>16)
            System.out.println("You are Eligible to Drive");

        if (age <= 16) {
            System.out.println("You are too Young");
        }






        // Write a program that ask the user for weather in fahrenheit
        //if weather is less than 32 print out It's Freezing. Stay home
        System.out.println("Enter weather in fahrenheit:");
        int weather = input.nextInt();
        if (weather < 32){
            System.out.println("It's Freezing. Stay home!");
        }if(weather >= 32 && weather < 42){
            System.out.println("It's little chilly outside");
        }
    }
}
