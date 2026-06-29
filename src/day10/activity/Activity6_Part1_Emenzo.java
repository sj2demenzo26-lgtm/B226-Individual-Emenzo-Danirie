/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.activity;

import java.util.Scanner;
public class Activity6_Part1_Emenzo {
    
    public static void main(String args[]){
        
        //Import Scanner
        Scanner input = new Scanner(System.in);
        
        //Declare a integer container
        int numberEntered ;
        
        //Display welcome message and instructions
        System.out.println("\t* WELCOME TO MULTIPLICATION TABLE GENERATOR *");
        System.out.println("\nInstruction:\nInput which multiplication table you want to display ");
        
        //Get user input
        System.out.print("\nMultiplication Table of: ");
        numberEntered = input.nextInt();
        
        //For loop condition
        for (int i = 1; i <= 10; i++){
            System.out.println(numberEntered + " * "+ i + " = "+ (numberEntered * i));
        }
    }
    
}
