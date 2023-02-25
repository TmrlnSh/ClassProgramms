package com.java.class27;

class Car {
    int speed=200;
    static int price = 600;

    void drive() {
        int speed = 100;
        System.out.println(speed);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.speed);
        c.drive();
        System.out.println(Car.price);

    }
}
