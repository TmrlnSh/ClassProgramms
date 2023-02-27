package com.java.class29;

public class wesa {
    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6};
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
    }
}
