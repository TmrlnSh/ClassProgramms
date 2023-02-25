package com.java.class14;

import java.util.Scanner;

public class charAtPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = sc.next();
        System.out.println(lastChar(word));
    }
    public static char lastChar(String word){
    int length = word.length();
    int index = length-1;
        return word.charAt(index);
    }
}
