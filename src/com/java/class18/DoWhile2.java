package com.java.class18;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do{System.out.println("Enter your number:");
        int num = sc.nextInt();

           num*=num;
            System.out.println(num);
            System.out.println("Do you want continue? Yes/No");
            answer = sc.next();
        }while(answer.equalsIgnoreCase("yes"));
    }
}
