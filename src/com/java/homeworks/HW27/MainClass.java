package com.java.homeworks.HW27;
class Parent {
    void message() {
        String messageFrom = "Parent";
        System.out.println("Hello, from "+messageFrom);
    }
}
class Child extends Parent {

    @Override
    void message(){
        String messageFrom = "Child";
        System.out.println("Hello, from "+messageFrom);
    }
}
public class MainClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.message();
    }
}
