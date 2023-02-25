package com.java.class25;

import java.util.Scanner;

public class Dog {
    String name;
    int age;
    char gender;

    Dog(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of dog:");
        String nameFromUser = sc.nextLine();
        System.out.println("Enter age of dog");
        int ageFromUser = sc.nextInt();
        name = nameFromUser;
        age = ageFromUser;
    }


    void bark (){
        System.out.println(name+" is barking");
    }

    void play(){
        System.out.println(name+" is playing");
    }
}
