package com.java.class33;

abstract class Fruits {
    abstract public void buy(String fruits);

    abstract public void eat(String fruits);

    public void makeJuice(String fruit) {
        System.out.println(fruit + " juice");
    }

    public void drop(String fruit) {
        System.out.println("Drop " + fruit);
    }
}

class Child1 extends Fruits {
    @Override
    public void buy(String fruits) {
        System.out.println("Buy some "+fruits);
    }

    @Override
    public void eat(String fruits) {
        System.out.println("Eat "+fruits);
    }
}

public class ClassAssignmentMain {
    public static void main(String[] args) {
        Fruits b = new Child1();
        b.buy("pineapples");
        b.eat("coconut");
        b.drop("apple");
        b.makeJuice("Banana");
    }
}
