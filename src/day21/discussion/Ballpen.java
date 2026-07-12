/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.discussion;

/**
 *
 * @author Danirie
 */
public class Ballpen {
    
    private int id;
    private String brand; // pilot
    private String color; // black
    private double price;
    private double pointSize;

    // setter method / mutator method
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor (String color) {
        this.color = color;
    }
    // getter method / accessor method
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    
}

}
