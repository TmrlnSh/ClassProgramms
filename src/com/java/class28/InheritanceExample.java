package com.java.class28;

class Calculator {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Sub = " + (a - b));
    }

}

class AdvancedCalculator extends Calculator {
    void mul(int a, int b) {
        System.out.println(a * b);
    }

    void div(int a, int b) {
        System.out.println(a / b);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.sub(40, 20);

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.sub(10,20);
        ac.mul(10,20);
        ac.div(40,20);
        ac.add(20,50);
    }
}
