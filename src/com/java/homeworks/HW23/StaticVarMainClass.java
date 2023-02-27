package com.java.homeworks.HW23;

class StaticVariables {
static int currentYear;
static String myName;
static char myGender;
}
public class StaticVarMainClass{
    public static void main(String[] args) {
        System.out.println(StaticVariables.currentYear);
        System.out.println(StaticVariables.myName);
        System.out.println(StaticVariables.myGender);

        System.out.println();

        StaticVariables obj = new StaticVariables();
        obj.currentYear=2023;
        obj.myName="Tamerlan";
        obj.myGender='m';
        System.out.println(StaticVariables.currentYear);
        System.out.println(StaticVariables.myName);
        System.out.println(StaticVariables.myGender);
    }
}
