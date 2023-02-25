package com.java.class23;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits =new String[8];
        for (int i = 0;i<fruits.length; i++){
            System.out.println("Write fruit "+(i+1)+"/8");
            fruits[i]= sc.next();
        }
        for (int i = 0; i< fruits.length; i++){
            for (int j =i+1; j<fruits.length; j++){
                if (fruits[i].equals(fruits[j])) {
                    System.out.println(fruits[i]);

                }
            }
        }



//        String data[]=new String[5];
//        System.out.println("Write any words");
//        for (int i = 0; i<data.length; i++){
//            data[i]= sc.next();
//        }
//        for (int i = 0; i<data.length; i++){
//            System.out.println(data[i]+" = "+data[i].length());
//        }
    }
}
