package com.java.homeworks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =10;
        while(num>=1){
            System.out.println(num);
            num--;
        }
        System.out.println("very easy!");

//        int balance;
//        int operation;
//        String operations;
//        String answer;
//
//        System.out.println("Welcome to the ATM machine!");
//        System.out.println("Please, enter your account opening balance:");
//        balance = sc.nextInt();
//        sc.nextLine();
//        do {
//            System.out.println("Please, choice the operations you want to perform:");
//            System.out.println("1)Withdraw\n2)Deposit\n3)Check balance");
//            operations = sc.nextLine();
//            if (operations.equalsIgnoreCase("1")||operations.equalsIgnoreCase("Withdraw")){
//                System.out.println("Please enter the amount you want to withdraw:");
//                operation = sc.nextInt();
//                sc.nextLine();
//                balance-=operation;
//                System.out.println("The available balance is "+balance);
//            } else if (operations.equalsIgnoreCase("2")||operations.equalsIgnoreCase("Deposit")) {
//                System.out.println("Please enter the amount you want to deposit:");
//                operation = sc.nextInt();
//                sc.nextLine();
//                balance+=operation;
//                System.out.println("The available balance is " +balance);
//            } else if (operations.equalsIgnoreCase("3")||operations.equalsIgnoreCase("Check balance")) {
//                System.out.println("The available balance is " +balance);
//            }
//            System.out.println("Do you want to perform more operations?\n1)Yes\n2)No");
//            answer = sc.nextLine();
//        } while (answer.equalsIgnoreCase("1") || answer.equalsIgnoreCase("Yes"));
    }
}
