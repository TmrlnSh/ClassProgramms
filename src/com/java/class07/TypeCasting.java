package com.java.class07;

public class TypeCasting {


    //incompatible means ->  not supported. things that don't fit each other
    //2 problems - 1) Trying to put decimal pointed numbers into whole number data types
    public static void main(String[] args) {
        double gasPrice = 1.99;
      //  int wholeNumber = gasPrice; //incompatible types compilation error
        int a =40;
       // short smallNum = a; //incompatible types compilation error

        //explicit type casting
        //double price = 2.99;
        //(int) is a type casting operator
       // int convert = (int) price;
        //System.out.println(price);

        float floatNum = 2.4f;
        //convert floatNum into a byte
        //and print out byte number
        byte convert2 = (byte) floatNum;
        System.out.println(convert2);

        //implicit -> automatic casting
        int num1 = 24;
        double doubleNum = num1; //automatically adds .0 at the end
        System.out.println(doubleNum); //24.0







//        I want to get Average customer Spending on my products
//        I sold $4,544,95.96
//        I64 - clients
//        find what is the average customer spending

        double totalMoney = 4544950.96;
        int clients = 64;
        double averageSpending = totalMoney/clients;
        System.out.println(averageSpending);

        // I drove 100 miles
        // gallons of gas = 2.4
        // how many miles per gallons did I spend

        int drove = 100;
        double gallons = 2.4;
        double milesPerGallon = drove/gallons;
        System.out.println(milesPerGallon);
    }
}
