package com.java.homeworks.HW23;

public class Iphone {
    static String os = "iOS";
    static String company = "Apple";
    static String logo = "Bitten apple";
    static String model = "14 Pro";
    int iosVersion;
    int ram;
    String game;
    String setting;
    int resolution;
     Iphone(){
         System.out.println("Your Operation System is - "+os);
         System.out.println("Company is - "+company);
         System.out.println("Company logo is "+logo);
    }
    Iphone(int iosVersion, int ram){

        this.iosVersion=iosVersion;
        this.ram=ram;
    }
     Iphone(int resolution, String setting, String game){
        this.resolution=resolution;
        this.setting=setting;
        this.game=game;
    }
    void getInfo(){
        System.out.println("Your iPhone model is - "+model);
        System.out.println("Your iOS version - "+iosVersion);
        System.out.println("Your RAM is - "+ram+"GB");
    }
    void phonePlays(){
        System.out.println("iPhone "+model+" is playing "+game+" with "+setting+" in "+resolution+" resolution");
    }
}
