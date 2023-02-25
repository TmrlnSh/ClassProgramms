package com.java.homeworks.HW22;

public class Computer {
    String model;
    int ram;
    int version;
    String color;
    String cpu;

    Computer(String model, int ram, int version, String color, String cpu){
        this.model=model;
        this.ram=ram;
        this.version=version;
        this.color=color;
//        this.cpu=cpu;
    }


    void getInfo(){
        System.out.println("Model - "+model);
        System.out.println("RAM -"+ram);
        System.out.println("Version - "+version);
        System.out.println("Color - "+color);
        System.out.println("CPU - "+cpu);
    }
    void turnOn(){
        System.out.println(model + " is running");
        System.out.println(this.cpu);
    }
}
