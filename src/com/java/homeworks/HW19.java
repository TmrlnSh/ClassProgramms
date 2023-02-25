package com.java.homeworks;

import java.util.Scanner;

public class HW19 {
    public static void main(String[] args) {


        //Write a program to count number of positive(consider zero also positive) and negative numbers from an array
        //Example
        //Input - 12, -45, 67, 23, -13, 45, -56
        //Output - Positive Elements - 4, Negative Elements - 3

//        int data[] = {-12,-45,67,23,-13,45,-56};
//        int positive  = 0;
//        int negative = 0;
//        for (int i = 0; i<data.length; i++){
//            if (data[i]>=0){
//                positive++;
//            }else{
//                negative++;
//            }
//        }
//        System.out.println("Positive - "+positive);
//        System.out.println("Negative - "+negative);





        //Write a program to find the sum of even and odd numbers
        //Example
        //Input - 12, 45, 67, 23, 13, 45, 56
        //Output - Sum of Even Elements - 68, Sum of Odd Elements - 193
        int data[] = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seven numbers:");
//        for (int i = 0; i<data.length; i++){
//            data[i]= sc.nextInt();
//        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i<=data.length-1; i++){
            data[i]= sc.nextInt();
            if (data[i]%2!=0){
            odd+=data[i];
            }else{
                even+=data[i];
            }
        }
        System.out.println("Even numbers "+even+", Odd numbers "+odd);






        //  Write a program to find the greatest number from an array
        //Example
        //Input - 12, 45, 67, 23, 13, 45, 56
        //Output - 67
//        int data[]=new int[7];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter seven numbers:");
//
//        for (int i = 0; i<data.length; i++){
//            data[i] = sc.nextInt();
//        }
//        int max=0;
//        for (int i =0; i<=data.length-1; i++){
//            if (data[i]>max){
//                max = data[i];
//            }
//        }
//        System.out.println(max);
    }
}
