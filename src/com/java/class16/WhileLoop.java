package com.java.class16;

public class WhileLoop {
    public static void main(String[] args) {
        //What are loops?
        //In programming pretty often you need to rerun the
        //same of come multiple times
        //And you need to accomplish that with minimal code

        //for ex: we want to write a program that counts
        //number of active users right now

//        int activeUsers = 0;
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);
//        activeUsers++;
//        System.out.println("Welcome User number "+activeUsers);

        //() -> boolean expression
        //while boolean expression is true
        int activeU = 0;
        //if you are dealing with counters
        //you boolean expression are going to be
        //< comparison operator
        while(activeU<15){
            activeU++;
            System.out.println("Welcome User number "+ activeU);
            //body
        }
    }

    //reuse the same logic is for methods
}
