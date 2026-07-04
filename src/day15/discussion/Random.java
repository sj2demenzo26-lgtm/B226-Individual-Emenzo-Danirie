/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day15.discussion;

/**
 *
 * @author Danirie
 */
public class Random {
    
    public static void main(String args[]){
        
        int [] lottoNumber = new int [6];
        int [] lottoNumberChecker = new int [6];
        
        int count = 1;
        for (int i=0; i < 6; i++){
            int randomNumber = (int) (Math.random()* 58) +1;
            lottoNumber [i] = randomNumber;
            System.out.println(randomNumber);
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                
                
            }
            System.out.println("");
        }
        
//        int currentNum = lottoNumber[0];
//        System.out.println("After removing duplicate");
//        
//        for (int i = 0; i < 6; i++) {
//            System.out.println(lottoNumber[i]);
//        }
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Check"+ lottoNumberChecker[i]);
        }
//        
//        System.out.println("Duplicate: " +currentNum);
//        for (int num : lottoNumber){
//            System.out.println(num);
//        }
        
        
        
        
    }
    
}
