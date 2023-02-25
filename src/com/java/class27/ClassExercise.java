package com.java.class27;

import javax.crypto.Mac;

class MacBook{
    static String brand = "Apple";
    static String os = "MacOS";
    String model = "MacBook Pro";
    static int price;
    int ram;
    int memory;

    static void sell(){
        MacBook c = new MacBook();
        System.out.println(brand+" "+c.model+" "+os+" sells for "+price);
    }
    void displayInfo(){
        ram = 16;
        memory=256;
        System.out.println(brand+" "+model+" "+os+" "+ram+" "+memory);
    }
}


public class ClassExercise {
    public static void main(String[] args) {
//        MacBook c = new MacBook();
        MacBook c = new MacBook();
        MacBook.sell();
        c.displayInfo();
        c.sell();
        System.out.println(c.brand);
//        System.out.println(MacBook.ram);



    }
}
