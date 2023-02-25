package com.java.class12;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create a function that return true or false and will let us know if we can sleepIn.
        //it should take 2 params - one to know if's a weekday
        //another param to know if it's a vacation.
        // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        System.out.println("Can we sleep in?");
        System.out.println("Enter the day of week:");
        String dayOfWeek = sc.next();
        System.out.println("Are you on vacation? (Yes/No)");
        String vacation = sc.next();
        System.out.println(canWeSleepIn(dayOfWeek, vacation));
    }


    public static boolean canWeSleepIn(String dayOfWeek, String vacation) {
        return dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday") || vacation.equalsIgnoreCase("Yes");
    }
}