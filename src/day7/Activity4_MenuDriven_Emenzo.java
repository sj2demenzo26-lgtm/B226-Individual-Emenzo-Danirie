/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.Scanner;
public class Activity4_MenuDriven_Emenzo {
    
    public static void main(String args []){
        
        Scanner input = new Scanner(System.in);
        int userInput;
        
        System.out.println("\tMAIN MENU");
        
        System.out.print("1. Start Game\n"
                + "2. Load Game\n"
                + "3. Settings\n"
                + "4. Exit");
        
        System.out.print("\n\nEnter your choice (1-4): ");
        userInput = input.nextInt();
        
        if (userInput == 1){
            System.out.println("\nYou selected Option 1: Start Game");
        }
        else if (userInput == 2){
            System.out.println("\nYou selected Option 2: Load Game");
        }
        else if (userInput == 3){
            System.out.println("\nYou selected Option 3: Settings");
        }
        else if (userInput == 4){
            System.out.println("\nYou selected Option 4: Exit");
        }
        else{
            System.out.println("\nInvalid choice. Please try again.");
        }
        
    }
    
    
    
    
    
    
}
