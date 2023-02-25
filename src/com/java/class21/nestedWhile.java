package com.java.class21;

public class nestedWhile {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j = 5; j>i; j--){
                System.out.print(" ");
            }
            for (int f = 1; f<=i;f++){
                System.out.print(f);
            }
            System.out.println();
        }
    }
}
