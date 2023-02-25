package com.java.homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework11 var = new Homework11();
//        As a user, I want to know if a year is a leap year, So that I can plan for an
//        extra day on February 29th during those years.
//        Acceptance Criteria:
//        All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
//        All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800,
//        and 1900 were NOT leap years, NOR will 2100 be a leap year),
//        All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
//        All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
//        Write a method that takes an int year and return true if the year is leap,
//        false if the year is not leap.
        System.out.println("Year is leap or not?\n" + "Please Enter the year:");
        int year = sc.nextInt();
        System.out.println(var.leapOrNot(year));
    }

    public boolean leapOrNot(int year) {
            return year%400==0 || year % 4 == 0 &&year%100!=0;
    }
}
