package com.java.class14;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class CharAt {
    //charAt (int i) -> return  a character at ith index
    //hard coding means NOT dynamic code.
    public static void main(String[] args) {

        String str = "wedevx.co";
        System.out.println(str.charAt(1));//e
        System.out.println(str.charAt(0));//w
        System.out.println(str.charAt(5));//x
        System.out.println(str.charAt(6));//.


        String str3 = "Superstar";
        System.out.println(str3.charAt(8));//index out of bound
        //Exceptions are runtime errors
        //StringIndexOutOfBoundsException
    }
}
