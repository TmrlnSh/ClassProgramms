package com.java.homeworks.HW22;

import java.util.Scanner;

public class Phone {
    String model;

    Phone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model of Phone:");
        model = sc.nextLine();
    }
    void phoneCall(){
        System.out.println(model+" is calling.");
    }
    void phoneFreeze(){
        System.out.println(model+" is freezing.");
    }
}
