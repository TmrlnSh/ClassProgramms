package com.java.class32;
class Phone{
    private String color;
    private String model;
    private String brand;

    private int memory;

    public int getMemory(){ //Getter
        return memory;
    }

    public void setMemory(int memory){ //Setter
        System.out.println("Setting the memory to \""+memory+"\" by user.");
            this.memory=memory;

    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Phone p  = new Phone();
        p.setMemory(256);
        System.out.println(p.getMemory());

    }
}
