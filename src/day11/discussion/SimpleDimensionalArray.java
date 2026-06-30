/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.discussion;

import java.util.Scanner;
public class SimpleDimensionalArray {
    
    public static void main(String args[]){
        
        String[] anime = new String [5];
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < anime.length; i++){
            System.out.print("Enter anime title: ");
            anime[i] = scan.nextLine();
        }
        
        System.out.println("\nAnime you entered: ");
        for (String title : anime){
            System.out.println(title);
        }
        
        
    }
    
}
