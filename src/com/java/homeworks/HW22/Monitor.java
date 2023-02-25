package com.java.homeworks.HW22;

public class Monitor {
    String brand;
    int inches;
    int resolution;

    Monitor(String brandOfMonitor, int inchesOfMonitor,
            int resolutionOfMonitor) {
        brand = brandOfMonitor;
        inches = inchesOfMonitor;
        resolution = resolutionOfMonitor;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + "\ninches: " +
                inches + "in\nResolution: " + resolution + "p");
    }
}
