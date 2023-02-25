package com.java.class28;
class Phone{
   String brand;
   String country;

    Phone(){
        brand="MI";
        country="China";
        System.out.println("Your phone brand is "+brand+" from "+country);
    }

}
class iPhone extends Phone{
    String model;
    static String os = "iOS";
    int ram;
    int memory;
    iPhone(){
        model="14 Pro";
        ram=16;
        memory=256;
        System.out.println("Your iPhone "+model+" have "+ram+"GB RAM and "+memory+"GB memory.");
    }
}

public class PhoneMainClass {
    public static void main(String[] args) {
        Phone obj2=new Phone();
        iPhone obj1= new iPhone();
    }
}
