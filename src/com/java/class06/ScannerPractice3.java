package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //write a program for login functionality
        //asks a user to input username and password
        //if username is "best@devx.com"
        //password is "Fall2022"
        //then print out true
        //otherwise print out false

        System.out.println("Username:");
        String  username = input.next();

        System.out.println("Password:");
        String  password = input.next();
        boolean logIn = username.equalsIgnoreCase("best@devx.com") && password.equals("Fall2022");
        System.out.println(logIn);


        //for Strings the best way to compare is to use .equals()
        //every String variable has .equals(), .equalsIgnoreCase()

        //.equalsIgnoreCase() --> a method that compares two strings
        //it will return true regardless of the case
    }
}
