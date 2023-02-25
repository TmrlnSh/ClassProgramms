package com.java.class19;

public class forLoop2 {
    public static void main(String[] args) {
//        for(int i =10; i>0; i--){
//            System.out.println(i);
//        }
//        int i = 0;
//        String str = "Hello World";
//        System.out.println(str.substring(i, i+1));
        String str = "xyz";
        System.out.println(xyzThere(str));
    }
    public static boolean xyzThere(String str) {
        boolean answer = false;
        for(int i = 0; i<str.length(); i++){
            if(i==0&&str.substring(i).startsWith("xyz")){
                 answer = true;
            }else if(str.indexOf("xyz")>0&&str.substring(str.indexOf("xyz")-1).startsWith(".")){
                 answer = false;
            }else{
                answer =false;
            }
        }return answer;
    }
}
