package com.java.homeworks;

import java.util.Scanner;

public class homework10c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Create a method that takes a person's height as a double (in meters)
        // and returns their height in feet and inches. Google the formula.
        System.out.println("Let's convert your meters into feet and inches!\n"
                +"Enter your height in meters (Ex: 1.75):");
        double height = sc.nextDouble();
        System.out.println(FeetInches(height));

    }
    public static String FeetInches(double height){
        double totalInches = height / 0.0254;
        int feet =(int) totalInches / 12;
        int inches = (int) totalInches % 12;
        return feet+"ft "+inches+"in";
    }
}
