package com.java.homeworks;

import java.util.Scanner;

public class HW18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to print the below pattern
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        char t = '*';
        for (int i =1; i<=9; i+=2){
            for (int k = 1; k<i; k+=2){
                System.out.print(" ");
            }
            for (int j = 9; j>=i; j--){
                System.out.print(t);
            }
            System.out.println();
        }

        //Write a program to print the below pattern
        //      *
        //     ***
        //    *****
        //   *******
        //  *********
//        char r ='*';
//        for (int i =1; i<=9; i+=2){
//            for (int k = 7; k>=i; k-=2){
//                System.out.print(" ");
//            }
//            for (int j =1; j<=i; j++){
//                System.out.print(t);
//            }
//            System.out.println();
//        }



        // 4.  Write a program to print the below pattern
        //*
        //**
        //***
        //****
        //*****
//        char t = '*';
//        for(int i =1; i<=5; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print(t);
//            }
//            System.out.println();
//        }

        //3. Write a program to check given number is palindrome or not
        //Example1
        //Input - 1221
        //Output - Palindrome
        //Example2
        //Input - 122321
        //Output - Not Palindrome

//        System.out.println("Enter your number:");
//        int num = sc.nextInt();
//        int result=0;
//        for(int i = num; i>0; i/=10){
//            result = (result*10)+(i%10);
//        }
//
//        if (num == result){
//            System.out.println("Your number is palindrome!");
//        }else {
//            System.out.println("Your number is NOT palindrome!");
//        }


        //Write a program to print reverse of the given String
        //Example
        //Input - Wedevx
        //Output - xvedeW
//        System.out.println("Enter your word:");
//        String word = sc.nextLine();
//
//        for (int i = word.length()-1; i>=0; i--){
//            System.out.print(word.charAt(i));
//        }


        //Write a program to count the number of vowels from the String (Ignoring Case)
        //Example
        //Input - Welcome to Java Class
        //Output - Num of vowels=7

//        System.out.println("Enter the word:");
//        String str = sc.next();
//        int vowel = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'o' ||
//                    str.toLowerCase().charAt(i) == 'e' || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'u') {
//                vowel++;
//            }
//        }
//        System.out.println(vowel);
    }
}