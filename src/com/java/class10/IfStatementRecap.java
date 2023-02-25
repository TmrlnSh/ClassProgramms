package com.java.class10;

import java.util.Scanner;

public class IfStatementRecap {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Let's determine the largest number (only WHOLE numbers)\n"+
                "Please enter first number:");
        num1 = input.nextInt();
        System.out.println("Second number:");
        num2 = input.nextInt();
        System.out.println("Third:");
        num3 = input.nextInt();

        if (num1>num2&&num1>num3){
            System.out.println(num1 + " is greater.");
        } else if (num2>num1&&num2>num3) {
            System.out.println(num2 + " is greater.");
        } else if(num3>num1&&num3>num2){
            System.out.println(num3 + " is greater");
        } else  {
            if (num1==num2&&num1>num3) {
                System.out.println(num1 + " and " + num2 + " are greater");
            }else if (num2==num3&&num2>num1) {
                System.out.println(num2+ " and "+num3+" are greater");
            }else if (num1==num3&&num3>num2) {
                System.out.println(num3 + " and " + num1 + " are greater");
            }else {
                System.out.println("All numbers are equal");
        }
    }
    }
}

