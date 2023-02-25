package com.java.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to sort array elements in ascending order using for-each loop
//        int[] array = {5, 2, 8, 7, 1};
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int num = array[i];
//                    array[i] = array[j];
//                    array[j] = num;
//                }
//            }
//        }

//        System.out.println(Arrays.toString(array));
////
//        System.out.println("After sorting: " + Arrays.toString(numbers));

        //Program to print the sum of the smallest and
        // greatest number from the array using for-each loop
//        int array[] = {45, 65, 85, 24, 45, 85, 34, 65, 100};
//        int min = Integer.MAX_VALUE;
//        int max = 0;
//        for (int i:array) {
//            if (i>max){
//                max=i;
//            }
//            if (i<min){
//                min=i;
//            }
//        }
//        System.out.println(min+max);


        //Write a program to find the sum of array elements using for-each loop

//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        int sum=0;
//        for (int i:array) {
//            sum+=i;
//        }
//        System.out.println(sum);


        // Write a program to get two 2D arrays from the user and print the sum of it
        int array1[][] = new int[3][3];
        int array2[][] = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter number of array 1."+(i+1));
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter number of array 2."+(i+1));
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.print(Arrays.deepToString(sum));
    }
}
