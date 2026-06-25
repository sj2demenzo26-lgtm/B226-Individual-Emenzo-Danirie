/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7.discussion;

import java.util.Scanner;
public class UserInput {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        
        System.out.println("Name: " +name);
        System.out.println("Age: "+age);
        System.out.println("Saraly: " +salary);
        
        
                
       
        
    }
    
}
