package com.java.class02;
public class ConditionalAnd {
    public static void main(String[] args) {
        //To issue driver license I want
        //students to have drive practice more than 80 hours
        //and have less than 5 missed classes
        //also age of students must be more than 17

        boolean giveTamerlanCertificate = false;

        double  TamerlansPractice = 81;
        int TamerlanMissedClasses = 4;
        int TamerlansAge = 24;

        giveTamerlanCertificate = TamerlansPractice > 80 && TamerlanMissedClasses < 5 && TamerlansAge > 17;
        System.out.println(giveTamerlanCertificate);

        System.out.println("===============================");
        boolean giveMilanaCertificate = false;

        double  MilanasPractice = 65;
        int MilanaMissedClasses = 2;
        int MilanasAge = 20;

        giveMilanaCertificate = MilanasPractice > 80 && MilanaMissedClasses < 5 && MilanasAge > 17;
        System.out.println(giveMilanaCertificate);
    }
}
