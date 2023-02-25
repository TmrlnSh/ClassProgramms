package com.java.class16;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
//        int num = 0;
//        while (num<20){
//            num++;
//            if (num%2==0)
//                System.out.println(num);
//        }

        //write a program
        //that will count number of vowel characters and
        //consonant characters in a String
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else  {
                consonants++;
            }
            i++;
        }
        System.out.println("Number of vowels "+vowels);
        System.out.println("Number of consonants "+consonants);
    }
}
