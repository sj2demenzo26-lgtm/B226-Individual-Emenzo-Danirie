/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;
import java.util.Scanner;

public class ConditionalStatement {
    
    public static void main(String args []){
        
        String username = "admin",
               password = "admin123",
               loginUsername,
               loginPassword;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        loginUsername = input.nextLine();
        
        System.out.print("Enter password: ");
        loginPassword = input.nextLine();
        
        if(loginUsername.equals(username) && loginPassword.equals(password)){
            System.out.println("Welcome! " + loginUsername);
        }
        else{
            System.out.println("Invalid Username or Password");
        }
        input.close();
        
    }
    
}
