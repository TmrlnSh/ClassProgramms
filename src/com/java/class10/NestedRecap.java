package com.java.class10;

import java.util.Scanner;

public class NestedRecap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //let's design the logic for restaraunt app
//first users should be given 2 options:
//appetizer or main course
//if user picks appetizers
//we should show users 2 appeterizer.
//1: spring rolls
//2: egg rolls
//once user is shown appetizer options they should be able select one
//appetizer.
//if user selects spring roll: print out spring roll ingredients
///if user selects egg roll: print out egg roll ingredients

//if user picks main course
//show
//1. Lagman
//2. New York Rib Eye steak
//if user selects Lagman: print out Lagman  ingredients
//if user selects New York Rib Eye steak: print out New York Rib Eye steak ingredients

               System.out.println("Welcome to New-York restaurant!\n" +
                       "Please enter number of order\n" +
                       "1. Main course\n" +
                       "2. Appetizer");
               int MainOrAppetizer = input.nextInt();
               if (MainOrAppetizer == 2) {
                   System.out.println("1. Spring rolls\n" +
                           "2. Egg rolls");
                   int SpringOrEgg = input.nextInt();
                   if (SpringOrEgg == 1) {
                       System.out.println("Spring rolls Ingredients");
                   } else if (SpringOrEgg == 2) {
                       System.out.println("Egg rolls Ingredients");
                   } else {
                       System.out.println("Invalid appetizer choice.");
                   }
               } else if (MainOrAppetizer == 1) {
                   System.out.println("1.Lagman\n" +
                           "2.New York Rib Eye steak");
                   int LagmanOrSteak = input.nextInt();
                   if (LagmanOrSteak == 1) {
                       System.out.println("Lagman Ingredients");
                   } else if (LagmanOrSteak == 2) {
                       System.out.println("NYC Steak Ingredients");
                   } else {
                       System.out.println("Invalid Main course choice.");
                   }
               } else {
                   System.out.println("Invalid choice.");
               }
               System.out.println("===============================\n" +
                       "Any drinks?\n" +
                       "1. Apple juice\n" +
                       "2. Orange juice\n" +
                       "3. Pineapple juice");
               int juice = input.nextInt();
               if (juice==1){
                   System.out.println("Apple juice ingredients.");
               } else if (juice==2) {
                   System.out.println("Orange juice ingredients.");
               } else if (juice==3) {
                   System.out.println("Pineapple juice ingredients.");
               }else {
                   System.out.println("Invalid juice choice.");
               }
        }
}

