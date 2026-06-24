/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.activity;

/**
 *
 * @author Danirie
 */
public class Activity3_Emenzo {
    
    
    public static void main(String args []){
        //Using the logical AND operator (&&)
        int age = 20;
        boolean hasValidID = true;
        System.out.println("Using the logical AND operator (&&)");
        System.out.println((age > 18 && hasValidID) ? "Access Granted" : "Access NOT Granted");
        
        //Using the logical OR operator (||)
        boolean isWeekend = true;
        boolean isHoliday = false;
        System.out.println("\nUsing the logical OR operator (||)");
        System.out.println((isWeekend || isHoliday) ? "No Classes Today" : "Have Classes Today");
       
        //Using the ternary operator (?:)
        int score = 85;
        System.out.println("\nUsing the ternary operator (?;)");
        System.out.println((score >= 75) ? "Passed" : "Failed");
        
        //Using the ternary operator (?:)
        int num1 = 10,
            num2 = 25;
        System.out.println("\nUsing the ternary operator (?;)");
        System.out.println("The largest number is: " + ((num1 > num2) ? num1: num2));
        
    }
    
}
