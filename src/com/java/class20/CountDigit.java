package com.java.class20;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();
        while(num>0){
            System.out.println(num%10);
            num=num/10;
        }
    }
}
