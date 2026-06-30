/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.Activity;

import java.util.Scanner;
public class Activit7_Emenzo {
    
    public static void main(String args []){
        //Set scanner object
        Scanner input = new Scanner(System.in);
        
        //Declare array of integer
        int[] numbers = new int [5];
        
        System.out.println("Please input 5 numbers");
        //Use for loop to put values in array
        for (int i=0; i<numbers.length; i++){
            System.out.print("Number "+ (i+1) +": ");
            numbers[i] = input.nextInt();
        }
        
        //Set a variable for sum
        int sum = 0;
        System.out.println("\nYou entered: ");
        
        //Use For Each loop to display all numbers entered.
        for (int i=0; i<numbers.length; i++ ){
          
            System.out.println("Index "+ i +": " +numbers[i]);
            sum += numbers[i]; 
        }
        
        //Set a variable for average
        float average = sum/5f;
        System.out.println("\nSum = "+ sum);
        System.out.println("Average = "+ average);
        
        
        //Stretch Goal
        //Set a variable. First index of array
        int currentHigh = numbers[0],
            currentLow = numbers[0];
        
        //Use for loop to iterate each index in a array
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] >= currentHigh){
                currentHigh = numbers[i];
            }else if (numbers[i] <= currentLow){
                currentLow = numbers[i];
            }
        }
        
        System.out.println("\nSTRETCH GOAL");
        System.out.println("Highest Number: "+ currentHigh);
        System.out.println("Lowest Number: "+ currentLow);
        
       
    }
    
}
