package com.java.class22;

public class SumOfArray {
    public static void main(String[] args) {
        int listOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};
        int targetNumber = 70;
        int result = 0;
        for (int i = 0; i <=listOfData.length-1; i++){
            if (listOfData[i]==targetNumber){
                result = i;
            }
        }
        System.out.println(result);

    }
}
