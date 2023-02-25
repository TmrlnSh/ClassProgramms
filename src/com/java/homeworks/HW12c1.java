package com.java.homeworks;

import java.util.Scanner;

public class HW12c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Homework 1:
//Write a method that takes a string and returns true if the string starts with “hi” and false otherwise.
        System.out.println("Enter your word:");
        String word = sc.nextLine();
        System.out.println(trueOrNot(word));
    }
    public static boolean trueOrNot (String word){
        return word.substring((0), 2).equals("hi");
    }
}
