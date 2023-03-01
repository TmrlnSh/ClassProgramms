package com.java.homeworks.HW28;

public class MainClass {
    public static void main(String[] args) {
        AndroidPhone android = new AndroidPhone();
        Iphone iPhone = new Iphone();
        ServiceCenter serviceCenter = new ServiceCenter();

        serviceCenter.servicePhone(iPhone);
        serviceCenter.servicePhone(android);
    }
}
