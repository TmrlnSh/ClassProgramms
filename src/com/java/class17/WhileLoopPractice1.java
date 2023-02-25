package com.java.class17;

import java.util.Scanner;

public class WhileLoopPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str = sc.nextLine();
        int num = str.length()-1;
        while (num>=0){
            System.out.print(str.charAt(num));
            num--;
        }
    }
}
