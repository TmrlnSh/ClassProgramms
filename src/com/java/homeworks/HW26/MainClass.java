package com.java.homeworks.HW26;

class Food {
    Food() {
        this("Boso Lagman", "Tea");
    }

    Food(String foodName, String drinks) {
        System.out.println("Yes, please give me " + foodName + " and " + drinks);
        System.out.println("But my friend is vegetarian, so pay attention!");
    }
}

class VegFood extends Food {
    VegFood() {
        this("Legumes");
    }

    VegFood(String vegFood) {
        System.out.println("Give me please " + vegFood);
    }
}

class Salad extends VegFood {
    Salad() {
        this("Summer Asian Slaw");
    }

    Salad(String saladName) {

    }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome to my restaurant! Do you want to order?");

    }
}
