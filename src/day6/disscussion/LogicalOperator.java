/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.disscussion;

/**
 *
 * @author Danirie
 */
public class LogicalOperator {
    
    public static void main(String args[]){
        
        
         boolean hasTicket = true;
         boolean hasVacinationCard = true;
         boolean isSeniorCitizen = true;
         boolean isStudent = true;
         boolean isLoggedIn = true;
         
         // (&&) May ticket -> pwede kang pumasok sa sinehan
         System.out.println("Allowed to enter cinema: " + (hasTicket && hasVacinationCard));
         
         // (||)May ticket (student || senior citizen -> Discounted
         System.out.println("Eligible for discount: " + (isStudent || isSeniorCitizen));
         
         // (!) Hindi naka-login sa app
         System.out.println("Cannot reserve seat: " + !isLoggedIn);
         
         
        
        
        
//        int num = 100,
//            num2 = 200;
//        
//        boolean result = num == num2 && num > num2;
//        System.out.println(result);
        
    }
    
}
