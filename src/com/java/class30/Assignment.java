package com.java.class30;
class Shape{
    void draw(){
        System.out.println("Shape Drawing");
    }
    void erase(){
        System.out.println("Shape erasing");
    }
}
class Circle extends Shape{
    @Override
 void draw(){
     System.out.println("Circle drawing");
 }
 void erase(){
     System.out.println("Circle erasing");
 }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Square drawing");
    }
    void erase(){
        System.out.println("Square erasing");
    }
}

public class Assignment {
    public static void main(String[] args) {
    Shape a = new Shape();
    Circle b = new Circle();
    Square c = new Square();

    b.draw();
    c.draw();
    }


}
