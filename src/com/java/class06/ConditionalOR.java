package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {

    //Conditional OR ||
    //if used for setting multiple conditions
    //and overall result is true only if one of them true

    //ex: I want give discounts to multiple group of people
    //if you are older than 60
    //if you are younger than 8

    int age = 25;

    boolean giveDiscount = age > 60 || age < 8;
        System.out.println(giveDiscount);

        //difference between && -> all conditions must true
        // || -> at least one of them must be true



        //if 24 hr time

        int currentTime=13;

        //coffee should be true
        //current time is 6-11.
        boolean drinkCoffee = currentTime > 6 && currentTime < 11;
        System.out.println(drinkCoffee);





        //tell me when I can start to relax
        //when you completed 5 exercises
        //or when you recorded 2 or more soft-skills videos

        int howManyJavaExercises = 0;
        int howManySoftSkillsVideos = 0;
        boolean canIRelaxNow = howManyJavaExercises == 5 || howManySoftSkillsVideos >=2;
        System.out.println(canIRelaxNow);




        // Banking industry app
        // when should the bank account be blocked?
        // loginAttempts more than 3
        //transaction amount is more than 3000$
        //location -> must match your current location

        int loginAttempts = 2;
        double transactionAmount = 299;
        String locationOfTransaction = "USA";

        boolean block = loginAttempts > 3 || transactionAmount > 3000 || locationOfTransaction != "KG";
        System.out.println(block);







        //Login Functionality
//Write a logic which would tell the user if logged in or not
//you have a username
//you have a password
//you loginLocation

//in order to be logged your userName should match steve@apple.com
//and your password should be infinityLoop1
//and you location should be california

       String userName = "steve@apple.com";
       String password = "infinityLoop1";
       String currentLocation = "California";

        boolean logIn = userName=="steve@apple.com" && password=="infinityLoop1" && currentLocation == "California";
        System.out.println(logIn);
    }
}
