/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17.activity;

/**
 *
 * @author Danirie
 */
public class Bike {

    // Attributes (Fields)
    String brand;
    String size;
    String type;

    // Constructor
    public Bike(String brand, String size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    // Method 1 - Traveling
    public void travel() {
        System.out.println(brand + " bike is being used for traveling.");
    }

    // Method 2 - Exercise
    public void exercise() {
        System.out.println(brand + " bike is being used for exercise.");
    }

    // Method 3 - Racing
    public void race() {
        System.out.println(brand + " bike is being used for racing.");
    }

    // Display Attributes
    public void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Size  : " + size);
        System.out.println("Type  : " + type);
    }
}