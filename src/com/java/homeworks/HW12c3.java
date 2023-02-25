package com.java.homeworks;

import java.util.Scanner;

public class    HW12c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Given a string of any length, return a
        // new string where the last 2 chars, if present,
        // are swapped, so “coding” yields “codign”.
        //lastTwo(“coding”) → “codign”
        //lastTwo(“cat”) → “cta”
        //lastTwo(“ab”) → “ba”
        System.out.println("Enter your word:");
        String word = sc.nextLine();
        System.out.println(output(word));
    }
    public static int output (String word){
        return (word.charAt(2)-word.charAt(7));
    }
}
