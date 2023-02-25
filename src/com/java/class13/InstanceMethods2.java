package com.java.class13;

import sun.security.jca.GetInstance;

import java.util.Scanner;

public class InstanceMethods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InstanceMethods2 stat = new InstanceMethods2();
        System.out.println("Enter number:");
        int num3 = sc.nextInt();
        System.out.println(stat.trueOrFalse(num3));
        System.out.println("Enter your numbers:");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        System.out.println(stat.sum(num5,num6));
    }
    public boolean trueOrFalse (int num3){
        return num3%3==0||num3%5==0;
    }
    public boolean sum(int num5,int num6){
        return num5==10||num6==10||num5+num6==10;
    }
    }
