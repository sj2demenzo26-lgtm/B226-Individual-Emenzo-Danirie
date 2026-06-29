
package day10.activity;


public class Activity6_Part2_Emenzo {
    
    public static void main(String args []){
        
        System.out.println("\tMULTIPLICATION TABLE");
        
        
        //Nested for loop
        for (int i = 1; i <= 10; i++){
            System.out.println("\nMultiplication Table of "+ i);
            for (int n = 1; n <=10; n++){
                System.out.println(i + " * "+ n + " = "+ (n * i));
            }
        }
        
    }
    
}
