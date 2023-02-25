package com.java.class11;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 0;
        System.out.println("Please rate our service! from 1 to 10.");
        rate = sc.nextInt();

        switch (rate) {
            case 1:
            case 2:
            case 3:
                System.out.println("Bad service");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Okay service");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Good service");
            default:
                System.out.println("Invalid input");

        }
//
//        int rate2 = 2;
//
//        switch (rate2) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Bad service");
//        }
//        System.out.println("Enter shipment state:");
//        String shipmentState;
//        shipmentState =sc.nextLine();
//        switch (shipmentState){
//            case "Alaska":
//                System.out.println("shipment cost is $10");
//                break;
//            case "NY":
//                System.out.println("shipment cost is $5");
//                break;
//            case "Florida":
//                System.out.println("shipment cost is $7");
//                break;
//            case "California":
//                System.out.println("shipment cost is $12");
//                break;
//        }
    }
}
