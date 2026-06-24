/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.disscussion;

public class ConditionalOperator {
    
    public static void main(String args[]){
        
        int num1 = 100,
            num2 = 50;
        
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        
        /*  &&          Result
            T   T       T
            T   F       F
            F   T       F
            F   F       F
        */
        
        /* ||           Result
            T   T       T
            T   F       T
            F   T       T
            F   F       F
        */
        
        
    }
    
}
