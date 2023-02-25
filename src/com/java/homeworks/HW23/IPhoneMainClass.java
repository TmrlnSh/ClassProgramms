package com.java.homeworks.HW23;

import java.util.Scanner;

public class IPhoneMainClass {
    public static void main(String[] args) {
        Iphone obj1 =new Iphone();
        Iphone obj2 = new Iphone(16,4);
        Iphone obj3 = new Iphone(1080,"Max quality","PUBG Mobile");

        obj2.getInfo();
        obj3.phonePlays();
    }
}
