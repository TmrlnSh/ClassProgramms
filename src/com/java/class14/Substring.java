package com.java.class14;

public class Substring {
    //substring returns a String which a substring from ith to the end of
    //original String
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(6));//return a substring from W onwards


        String str1 = "Tesla Motors inc.";
        System.out.println(str1.substring(6));


        String str3 = "Maldive Islands";
        System.out.println(str3.substring(0,2));
    }
}
