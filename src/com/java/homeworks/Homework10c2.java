package com.java.homeworks;

import java.util.Scanner;

public class Homework10c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create a method that takes a char representing a grade (A, B, C, D, or F) and
        // returns a boolean indicating whether the grade is passing or failing.
        // A and B are passing, C,D,F are failing.
        System.out.println("Are ypu passed or failed?\n" + "Enter your grade (A,B,C,D or F):");
        char grade = sc.next().toUpperCase().charAt(0);
        System.out.println(isPassingGrade(grade));

    }

    public static boolean isPassingGrade(char grade) {
        switch (grade) {
            case 'A':
            case 'B':
                return true;
            default:
                return false;
        }
    }
}
