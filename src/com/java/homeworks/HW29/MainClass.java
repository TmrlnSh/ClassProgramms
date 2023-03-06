package com.java.homeworks.HW29;
public class MainClass {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(24);
        obj.setName("Tamerlan");
        obj.setFrom("Kyrgyzstan");
        obj.setHeight(175);
        obj.setWeight(55);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getFrom());
        System.out.println(obj.getHeight());
        System.out.println(obj.getWeight());
    }

}
