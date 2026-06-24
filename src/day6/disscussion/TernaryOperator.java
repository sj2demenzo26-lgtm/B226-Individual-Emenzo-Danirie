/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.disscussion;


public class TernaryOperator {
    
    public static void main(String args []){
        // syntax
        // (condition) ? true block : false block;
        // Positive or Negative
        int num = 1;
        
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println(result);
        
        // Fever or Normal Temp
        float temp = 38.5f;
        
        String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
        System.out.println(tempResult);
        
        
        
        
    }
    
}
