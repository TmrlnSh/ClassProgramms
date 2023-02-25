package com.java.class08;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's check numbers! Odd or Even?");
        System.out.println("Enter your number:");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+" is odd");
        }
    }
}
