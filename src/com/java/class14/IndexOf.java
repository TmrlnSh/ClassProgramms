package com.java.class14;

public class IndexOf {
    public static void main(String[] args) {

        //index (String str) -> returns the index of the first occurrence
        //whenever there is no matching string then returns -1
        String str = "tik tak";
        System.out.println(str.indexOf("tak"));
        System.out.println(str.indexOf("k"));

        String str2 = "bla bla bla";
        System.out.println(str2.indexOf("la"));


        String str3 = "MacBook Air, Nike Air, iPod Air";
        System.out.println(str3.indexOf("Air",10));
        System.out.println(str3.indexOf("Air",19));

        String str4 = "Lala polluza lala land la lakers";
        System.out.println(str4.indexOf("la",13));

        String str5 = "Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));

        String str6 = "Almazova";
        int last2Chars = str6.lastIndexOf("va");
        System.out.println(last2Chars);
    }
}
