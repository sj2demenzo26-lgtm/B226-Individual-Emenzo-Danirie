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
public class Activity13_Emenzo_Main {

    public static void main(String[] args) {

        // Object 1
        Bike bike1 = new Bike("Trek", "26 inches", "Mountain Bike");

        // Object 2
        Bike bike2 = new Bike("Giant", "27.5 inches", "Road Bike");

        // Object 3
        Bike bike3 = new Bike("Cannondale", "29 inches", "Racing Bike");

        System.out.println("========== BIKE INFORMATION ==========\n");

        System.out.println("----- Bike 1 -----");
        bike1.displayInfo();
        bike1.travel();
        bike1.exercise();
        bike1.race();

        System.out.println("\n------------------------------\n");

        System.out.println("----- Bike 2 -----");
        bike2.displayInfo();
        bike2.travel();
        bike2.exercise();
        bike2.race();

        System.out.println("\n------------------------------\n");

        System.out.println("----- Bike 3 -----");
        bike3.displayInfo();
        bike3.travel();
        bike3.exercise();
        bike3.race();

        System.out.println("\n========== END OF PROGRAM ==========");
    }
}
