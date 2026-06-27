/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.activity;


public class Activity5_Emenzo {
    
    public static void main(String args[]){
        //Activity 5.1 Summation of 1 to N
        
        System.out.println("Activity 5.1 - Summation of 1 to N");
        int sum = 0;
        for (int i=1; i<6; i++){
            System.out.println("i = "+ i + ", sum = "+ (sum += i));
        }
        System.out.println("Final Sum: "+ sum);
        
        //Activity 5.2 - Product of 1 to N
        
        System.out.println("\nActivity 5.2 - Product of 1 to N");
        int product = 1;
        for (int i=1; i<6; i++){
            System.out.println("i = "+ i + ", product = "+ (product *= i));
        }
        System.out.println("Final Product: "+ product);
        
        //Activity 5.3 - Arithmetic Sequence (Sum Only)
        System.out.println("\nActivity 5.3 - Arithmetic Sequence (Sum Only)");
        
        int startNumber = 1,
            commonDifference = 5,
            n = 5,
            sum2 = 1,
            sum3 = 0;
        for (int i = startNumber;i <= n; i ++){
            System.out.print(sum2 + " + ");
            sum2 += commonDifference;
            sum3 = sum2 + sum2;
        }
        System.out.println("="+sum3);
        
        
        
        
        
    }
    
}
