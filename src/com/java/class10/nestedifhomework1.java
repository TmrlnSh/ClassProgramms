package com.java.class10;

import java.util.Scanner;

public class nestedifhomework1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please choose one of them");
        System.out.println("1.Appetizer");
        System.out.println("2.Main course");
        System.out.println("3.Drinks");
        String choose1= input.nextLine();
        if(choose1.equalsIgnoreCase("Appetizer")||choose1.equals("1")) {
            System.out.println("1.Spring Roll");
            System.out.println("2.Egg Roll");
            String roll = input.nextLine();



            if(roll.equalsIgnoreCase("Spring Roll") || roll.equals("1")) {

                System.out.println("Spring Roll ingredients: \n 1. thin rice noodles\n 2.Butter lettuce\n 3.Vegetables");
            } else if (roll.equalsIgnoreCase("Egg Roll") || roll.equals("2")) {
                System.out.println("Egg Roll ingredient:  1.Eggs \n 2.butter lettuce");
            } else  {
                System.out.println("Invalid appetizer choice");
            }

        }

        else if (choose1.equalsIgnoreCase("Main course")||choose1.equals("2")) {
            System.out.println("1.Lagman");
            System.out.println("2.NYC Steak");
            String main1 = input.nextLine();


            if (main1.equalsIgnoreCase("Lagman") || main1.equals("1")) {
                System.out.println("Lagman ingredients");
            } else if (main1.equalsIgnoreCase("NYC Steak") || main1.equals("2")) {
                System.out.println("NYC Steak ingredients");
            }
            else   {
                System.out.println("Invalid main course choice");
            }

        }
        if(choose1.equalsIgnoreCase("Drinks")||choose1.equals("3")){
            System.out.println("1.Orange juice");
            System.out.println("2.Apple juice");
            System.out.println("3.Pineapple juice");
            String juice= input.nextLine();
            if(juice.equalsIgnoreCase("Orange juice")||juice.equals("1")){
                System.out.println("Orange juice ingredients:");
            } else if(juice.equalsIgnoreCase("Apple juice")||juice.equals("2")){
                System.out.println("Apple juice ingredients");
            } else if(juice.equalsIgnoreCase("Pineapple juice")||juice.equals("3")){
                System.out.println("Pineapple juice ingredients: \n fresh pineapple from Africa");
            } else{
                System.out.println("Invalid drink choice");
            }
        }
        else{
            System.out.println("invalid menu choice");
        }
    }
}







