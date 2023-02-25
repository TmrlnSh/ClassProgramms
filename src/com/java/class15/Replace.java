package com.java.class15;

public class Replace {
    public static void main(String[] args) {
        String str = "earth is flat";
        String replaced = str.replace('a','h');
        System.out.println(replaced);

        String str3 = "public static void main(String{} args)";
        String str4 = str3.replace('{','[').replace('}',']');
        System.out.println(str4);

        String str12 = "system.out.println(Hello world)";
        String str13 = str12.replace("(Hello world)", "(\"Hello world\");");
        System.out.println(str13);

        String str14 = str13.replaceFirst("s","S");
        System.out.println(str14);
    }
}
