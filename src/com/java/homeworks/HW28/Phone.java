package com.java.homeworks.HW28;

class Phone {
    void call(){
        System.out.println("Call from ");
    }
    void text(){
        System.out.println("Text from ");
    }
    void repair(){
        System.out.println("Repairing ");
    }
}
class AndroidPhone extends Phone{
    @Override
    void repair(){
        System.out.println("Repairing Android");
    }
}
class Iphone extends Phone{
    @Override
    void repair(){
        System.out.println("Repairing iPhone");
    }
}
