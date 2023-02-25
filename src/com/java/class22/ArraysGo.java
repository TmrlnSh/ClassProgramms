package com.java.class22;

import java.util.Scanner;

public class ArraysGo {
    public static void main(String[] args) {
        int data[]=new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five numbers:");

        for(int i =0; i<data.length; i ++){
            data[i]= input.nextInt();
        }
        System.out.println("Please enter target number:");
        int targetNumber = input.nextInt();
        for (int i =0; i<data.length; i++){
            if( data[i] == targetNumber){
                System.out.println(i);
            }
        }
    }
}
