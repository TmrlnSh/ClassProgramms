package com.java.class14;

public class StringPractice {
    public static void main(String[] args) {
        //two ways of concatenating Strings
        //one via + sign

        //Strings are immutable objects ->
        //Strings can't be modified
        //in order to change the String you have to reassign values
        //whenever you use String manupulation
        String str = "<html>";
        str+="<body>";
        str+="<h1>Hello DevX<h1>";
        str+="</body>";
        str+="</html";

        System.out.println(str);

        String str1 = "public class Hello";
        str1.concat("{");
        // \n -> creates new line
        // \t -> creates a tab.
        // \" -> add " as a String
        // \\ - > add \\ as a String
//        str1=str1.concat("\n{");
        System.out.println(str1);

    }
}
