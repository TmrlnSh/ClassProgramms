package com.java.homeworks;

public class HW14 {
    public static void main(String[] args) {
        //Write a program that calculates the sum of all even
        //numbers between 1 and a 100 using a while loop.
//        int num = 0;
//        int sum = 0;
//        while (num<=100){
//            sum+=num;
//            num+=2;
//        }
//        System.out.println(sum);

       //Write a program that prints all prime numbers
        //between 1 and a 100  using a while loop.
        int i = 1;
        while (i <= 100) {
            boolean isPrime = true;
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
