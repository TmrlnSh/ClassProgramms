package com.java.class15;

public class Replace2 {
    public static void main(String[] args) {
        String str = "DevX Adventures World";
        int firstSpace = str.indexOf(" ");
        String replaced = str.substring(firstSpace).replaceFirst("e", "X");
        String DevXOnly = str.substring(0, firstSpace);
        String finalResult = DevXOnly.concat(replaced);
        System.out.println(finalResult);
    }
}