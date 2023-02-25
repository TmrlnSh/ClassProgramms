package com.java.class13;

import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 num:");
        int a = sc.nextInt();
        System.out.println("Enter 2 num:");
        int b = sc.nextInt();
        System.out.println(sum(a, b));

    }
    public static int sum(int a, int b){
        if (a==b){
            return (a+b)*2;
        }else {
            return a+b;
        }
    }
}
