package com.java.homeworks;

import java.util.Scanner;

public class HW17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //5.  Write a program to print the reverse of the given number
        //Example1
        //Input - 86545
        //Output - 54568
        //Example2
        //Input - 23561
        //Output - 16532
        System.out.print("Enter your number:");
        int num = sc.nextInt();
        while(num>0){
            System.out.print(num%10);
            num/=10;
        }



        //4.  Write a program to print the greatest digit from the given number
        //Example1
        //Input - 86545
        //Output - greatest digit is 8
        //Example2
        //Input - 23561
        //Output - greatest digit is 6
//        int num = sc.nextInt();
//        int rem=0;
//        int max=0;
//        while (num > 0) {
//            rem = num % 10;
//            if (max < rem) {
//                max = rem;
//            }
//            num = num / 10;
//        }
//        System.out.println(max);


        //3. Write a program to print the sum of each digit from the given number
        //Example1
        //Input - 3521
        //Output - 11
        //Example2
        //Input - 5390
        //Output - 17
//        System.out.println("Enter your number:");
//        int num = sc.nextInt();
//        int result = 0;
//        while(num>0){
//             int remainder = num%10;
//             num/=10;
//             result += remainder;
//        }
//        System.out.println(result);

        //  2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
//
//        int i;
//        double result = 0;
//        double divide = 2;
//        for (i = 1; i <= 10; i++) {
//            result += (i / divide);
//            divide++;
//        }
//        System.out.println(result);

        //1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5

//        int i;
//        int result = 0;
//        int pow = 0;
//        for (i = 1; i <= 5; i++) {
//            pow++;
//            result += Math.pow(i, pow);
//        }
//        System.out.println(result);
    }
}
