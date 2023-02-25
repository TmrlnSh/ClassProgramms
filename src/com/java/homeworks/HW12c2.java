package com.java.homeworks;

import java.util.Scanner;

public class HW12c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HW12c2 var = new HW12c2();
        //Homework 2:
        //Write a method that takes a string   returns a new string made of 3
        // copies of the last 2 chars of the original string.
        // The string length will be at least 2.
        //extraEnd(“Hi”) → “HiHiHi”
        //extraEnd(“Hello”) → “lololo”
        //extraEnd(“ab”) → “ababab”
        System.out.println("Enter your word:");
        String word = sc.next();
        System.out.println(var.last2Chars(word).concat(var.last2Chars(word).concat(var.last2Chars(word))));
    }
    public String last2Chars (String word){
        return word.substring(word.length()-2);
    }
}
