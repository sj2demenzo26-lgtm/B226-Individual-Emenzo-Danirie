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
        System.out.println("\n======================================================");
        System.out.println("\nActivity 5.2 - Product of 1 to N");
        int product = 1;
        for (int i=1; i<6; i++){
            System.out.println("i = "+ i + ", product = "+ (product *= i));
        }
        System.out.println("Final Product: "+ product);
        
        //Activity 5.3 - Arithmetic Sequence (Sum Only)
        System.out.println("\n======================================================");
        System.out.println("\nActivity 5.3 - Arithmetic Sequence (Sum Only)");
        
        int startNumber = 1,
            commonDifference = 5,
            n = 5,
            sum2 = 1,
            sum3 = 0;
        for (int i = startNumber;i <= n; i++){
            sum3 += sum2;
            System.out.print(sum2 + " + ");
            sum2 += commonDifference;
            
        }
        System.out.println("0 = "+sum3);
        
        //Activity 5.4 – Arithmetic Sequence (Sum and Product)  
        System.out.println("\n======================================================");
        System.out.println("\nActivity 5.4 – Arithmetic Sequence (Sum and Product)");
        System.out.println("\nstartNumber2  = 1 \ncommonDifference2 = 5 \nn2 = 10\n");
        
        System.out.print("Sum: ");
        int startNumber2  = 1,
            commonDifference2 = 5,
            n2 = 10,
            sum4 = 1,
            sum5 = 0;
        for (int i = startNumber2; i <= n2; i++){
            sum5 += sum4;
            System.out.print(sum4 + " + ");
            sum4 += commonDifference2;
            
        }
        System.out.println("0 = "+sum5);
        
        
        System.out.print("\nProduct: ");
        int startNumber3 = 1,
            commonDifference3 = 5,
            n3 = 10,
            product1 = 1;
        
        long product2 = 1;
        for (int i = startNumber3;i <= n3; i++){
            product2 *= product1;
            System.out.print(product1+ " * ");
            product1 += commonDifference3;
            
        }
        System.out.println("1 = "+product2);
        
        
        
        
        
    }
    
}
