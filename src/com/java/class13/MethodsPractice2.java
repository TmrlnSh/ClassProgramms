package com.java.class13;

import java.util.Scanner;

public class MethodsPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1= sc.nextInt();
        System.out.println("Enter your second number:");
        int num2= sc.nextInt();
        System.out.println(trueOrFalse(num1,num2));
    }
    public static boolean trueOrFalse(int num1, int num2){
        return num1 >= 10 && num1 <= 20 || num2 >= 10 && num2 <= 20;
    }
}
