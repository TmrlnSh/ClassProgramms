package com.java.class29;

class Drinks {

}

class HotDrinks {
    HotDrinks(){
        System.out.println("Hot Drinks ");
    }
    HotDrinks(String name) {
        System.out.println(name);

    }
}

class Tea extends HotDrinks {
    Tea() {
        super("Original");
        System.out.println("Prep Tea");
    }

    Tea(String flavour) {
        this("Masala", true);//this has to be a first statement only
        System.out.println("Prep Tea with flavour " + flavour);
    }

    Tea(String flavour, boolean withSugar) {
        System.out.println("Prep Tea with flavour " + flavour);
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Tea tea = new Tea();
    }
}
