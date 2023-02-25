package com.java.class17;

import java.util.Scanner;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word or number:");
        String str = sc.nextLine();
        if (Palindrome(str)){
            System.out.println("String is palindrome.");
        }else{
            System.out.println("String is NOT palindrome");
        }
    }

    public static boolean Palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= str.length() / 2) {
            if (str.charAt(start) == str.charAt(end)) {
                return true;
            }
            start++;
            end--;
        }return false;
        }
    }

