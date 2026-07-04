/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danirie
 */
public class Activity11_Emenzo {
    
    public static void main(String args[]){
        //Set up array that has length of 6
        int [] lottoNum = new int [6];
        
        //Use for loop to add random number in array
        for (int i = 0; i < lottoNum.length; i++) {
            //Create a integer called random and use math method random()
            int random = (int) (Math.random() * 58) + 1;
            lottoNum[i] = random;
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    i--;
                    break;
                }
            }
            
        }
        //Use for each loop to display all the value in array
        System.out.println("==========================");
        System.out.println("||\tLotto Draw\t||");
        System.out.println("==========================\n");
        System.out.print("| ");
        for(int num : lottoNum){
            System.out.print(num+" | ");
        }
        System.out.println("");
        
        
      
        
    }
    
}
