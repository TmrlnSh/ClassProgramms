package com.java.class17;

import java.util.Scanner;

public class WhilePractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word;");
        String str = sc.nextLine();
        int num = 1;
        while (num <= str.length()-1){
            System.out.print(str.charAt(num));
            num+=2;
        }
    }
}
