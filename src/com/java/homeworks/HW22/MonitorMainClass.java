package com.java.homeworks.HW22;

public class MonitorMainClass {
    public static void main(String[] args) {
        Monitor aoc = new Monitor("AOC", 42, 1080);
        aoc.displayInfo();
        System.out.println();
        Monitor apple = new Monitor("Apple", 62, 2160);
        apple.displayInfo();
        System.out.println();
        Monitor samsung = new Monitor("Samsung", 84, 2700);
        samsung.displayInfo();
    }
}
