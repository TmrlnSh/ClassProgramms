package com.java.class06;
import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //nextInt(), nextLine(), nextBooloean() -> they are all
        // methods
        //all method return a result. make sure you know what data type y
        //the method returns

        //before we ask for user input we should tell the user
        //what type of info we want from them

        System.out.println("Please Enter your age!");
        int  age = input.nextInt();
        System.out.println("Age = " +age);

        System.out.println("Please enter your credit score between 0-820!");
        int  creditScore = input.nextInt();
        System.out.println("Credit Score = " +creditScore);

        //ask a user their marital status
        //married, single
        //true, false

        System.out.println("Please enter your marital status: false or true");
        Boolean  married = input.nextBoolean();
        String maritalStatus;
        if (married) {
            maritalStatus = "married";
        } else {
            maritalStatus = "single";
        }
        System.out.println("Marital Status = " +maritalStatus);

        //input.next() -> takes only one word(the text until the first space)
        //input.next.Line() -> takes full line of text
    }
}
