/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;
public class switchStatement {
    
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("You selected Option 1: Start Game");
                break;
            case 2:
                System.out.println("You selected Option 2: Load Game");
                break;
            case 3:
                System.out.println("You selected Option 3: Settings");
                break;
            case 4:
                System.out.println("You selected Option 4: Exit");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid choice");
        }
    }
    
}
