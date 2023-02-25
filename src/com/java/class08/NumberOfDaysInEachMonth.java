package com.java.class08;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days in each month?");
        System.out.println("Enter number of month: ");
        int numOfMonth = input.nextInt();

        if(numOfMonth == 1){
            System.out.println("January. There's 31 days");
        } else if (numOfMonth == 2) {
            System.out.println("February. There's 28 or 29 days");
        } else if (numOfMonth == 3) {
            System.out.println("March. There's 31 days");
        } else if (numOfMonth == 4) {
            System.out.println("April. There's 30 days");
        } else if (numOfMonth == 5) {
            System.out.println("May. There's 31 days");
        } else if (numOfMonth == 6) {
            System.out.println("June. There's 30 days");
        }else if (numOfMonth == 7){
            System.out.println("July. There's 31 days");
        } else if (numOfMonth == 8) {
            System.out.println("August. There's 31 days");
        } else if (numOfMonth == 9) {
            System.out.println("September. There's 30 days");
        } else if (numOfMonth == 10) {
            System.out.println("October. There's 31 days");
        } else if (numOfMonth == 11) {
            System.out.println("November. There's 30 days");
        } else if (numOfMonth == 12) {
            System.out.println("December. There's 31 days");
        }else {
            System.out.println("Wrong entry. Only numbers 1-12 are allowed. Try again");
        }
    }
}
