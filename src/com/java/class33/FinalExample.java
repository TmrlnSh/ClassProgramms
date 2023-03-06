package com.java.class33;

class Parent {
    final void eat() {
        System.out.println("Soup");
    }
}

final class Child extends Parent {

}

public class FinalExample {
    public static void main(String[] args) {
        final int i = 10;
        //i++; this will give you error
        System.out.println(i);
    }
}
