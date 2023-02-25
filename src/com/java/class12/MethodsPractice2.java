package com.java.class12;

import java.util.Scanner;

public class MethodsPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //We have a loud talking parrot. Create a function that will tell us if we are in trouble
        //or not based on the hour and based on if the parrot is talking.
        //The "hour" is the current hour time in the range 1..24.
        //We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        //Return true if we are in trouble.
        System.out.println("Are you in trouble?");
        System.out.println("What time is it?");
        int time = sc.nextInt();
        if (time>24||time<1){
            System.out.println("Wrong input");
        }else {
            System.out.println("Parrot is talking now?(Yes/No)");
            String parrot = sc.next();
            System.out.println(trouble(time, parrot));
        }
    }
    public static boolean trouble(int time, String parrot){
        return time < 7 || time > 20 && parrot.equalsIgnoreCase("yes");
    }
}
