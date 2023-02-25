package com.java.homeworks;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        int num = 1;
        while (num<20){
                System.out.println(num);
                num+=2;
        }
        int a = 0;
        int b =0;
        while (b<=10){
            a += b++;
            System.out.println(a);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print table:");
        int num2 = sc.nextInt();
        int multiple = 1;
        while (multiple<=10){
            int answer = num2 * multiple;
            System.out.println(num2 +"*"+ multiple + "=" + answer);
            multiple++;
        }
    }
}
