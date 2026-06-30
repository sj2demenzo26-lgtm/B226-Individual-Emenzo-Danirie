/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.discussion;

/**
 *
 * @author Danirie
 */
public class MiniActivity {
    
    public static void main(String args[]){
        
        int[] ages = {24, 43, 35, 18, 28, 25};
        
        System.out.println("Using for loop");
        
        for (int i = 0; i < ages.length; i++){
            
            System.out.println(ages[i]);
        }
        
        System.out.println("\nUsing for each loop");
        for (int age : ages){
            System.out.println(age);
        }
        
        
    }
    
    
}
