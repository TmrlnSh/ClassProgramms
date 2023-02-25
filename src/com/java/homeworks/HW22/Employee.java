package com.java.homeworks.HW22;

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    int experience;
    int model;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        System.out.println("Enter your experience");
        experience = sc.nextInt();
    }

    void Info(){
        if (age > 18&& experience>=2){
            System.out.println(name+", you are hired to work because you older than 18 and your experience more than 2 years.");
        }else{
            System.out.println("Sorry "+age+" you are not hired to work because of your age or not enough experience.");
        }
    }
    Employee(String model){
        System.out.println(model);
    }
}
