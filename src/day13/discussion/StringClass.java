/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13.discussion;

import java.util.Scanner;
public class StringClass {
    
    public static void main(String args[]){
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure that you want to exit? \n\t[Y] Yes \n\t[N] No");
        System.out.print("Enter your choice: ");    
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Go Back to Main Menu");
        }
        
    }
    
}
