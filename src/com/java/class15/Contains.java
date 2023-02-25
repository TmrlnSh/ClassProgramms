package com.java.class15;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something:");
        String str = sc.nextLine();


        //contains return boolean
        //return true if the given String param exist
        //in the String
        boolean doesContain = str.contains("Apple");
        System.out.println(doesContain);
    }
}
