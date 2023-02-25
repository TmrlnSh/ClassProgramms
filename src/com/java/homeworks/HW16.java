package com.java.homeworks;

import java.util.Scanner;

public class HW16 {
    public static void main(String[] args) {
//Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2
//        int num = 5;
//        int result = 0;
//        for(int i = 0; i<=num; i++){
//            result+=(Math.pow(i,2));
//        }
//        System.out.println(result);







        //Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
//        int num = 1;
//        int result = 0;
//        int i;
//        for( i = 10; i>=num; i--){
//            result+=(i+num);
//            num++;
//        }
//        System.out.println(result);







        int num = 10;
        int result = 0;
for (int i = 0; i<=num; i++){
    if(i==3||i==9||i==6){
        result-=i;
    }else{
        result+=i;
    }
}
        System.out.println(result);







        //3. Write a program to find a magic number from 1 to 100
//        int num = 100;
//        int count = 0;
//        for (int i = 0; i<=num;i++){
//            if(i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1){
//                System.out.println(i);
//            }
//        }




//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int num = sc.nextInt();
//        //Write a program to count the number of divisors of the given numbers
//int count =0;
//        for(int i =1; i<=num; i++){
//            if(num%i==0){
//                count++;
//            }
//        }
//        System.out.println(count);


        //1. Write a program to print the sum of even numbers from 1 to 10
//        int result=0;
//        for(int i =0; i<=10;i+=2){
//            result+=i;
//        }
//        System.out.println(result);
}
}
