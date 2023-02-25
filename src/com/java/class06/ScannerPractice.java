package com.java.class06;
//must have to be able to user Scanner
//import statement is a statement that tell our class yo use functionalities
//from different packages

import java.util.Scanner;

public class ScannerPractice {
    //compiling a code => checking if we are matching all syntax rules
    public static void main(String[] args) {

        //before you can use scanner you have to have import statement
        //before public class line

        Scanner input = new Scanner(System.in);

        //input.nextInt() -> will enable us to input and int data to our
        //program
        //if will allow us to enter an integer
        input.nextInt();

//        //user can write any text
//        input.nextLine();
//
//        //user can write only decimal value
//        input.nextDouble();
//
//        //user car write true or false only
//        input.hasNextBoolean();
    }
}
