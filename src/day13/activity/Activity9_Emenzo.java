/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13.activity;

import java.util.Scanner;
public class Activity9_Emenzo {
    
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        String name = "Juan Migiel"; 
        
//        // 1. contains()
//        System.out.println(" 1. contains()");
//        System.out.println("Original String: " + name);
//        System.out.println("Contains 'p'?: " + name.contains("p"));
//        
//        // 2. endsWith()
//        System.out.println("\n 2. endsWith() ");
//        System.out.println("Original Stringname");
//        System.out.println("Ends with 's'?: " + name.endsWith("s"));
//        
//        // 3. startsWith()
//        System.out.println("\n 3. startsWith() ");
//        System.out.println("Original String: " + name);
//        System.out.println("Starts with 'P'?: " +name.startsWith("P"));
//        
        // 4. indexOf()
        System.out.println("\n 4. indexOf() ");
        System.out.println("Original String: " + name);
        System.out.println("Index of first 'i': " + name.indexOf("i"));
        
//        // 5. isEmpty()
//        System.out.println("\n 5. isEmpty() ");
//        System.out.println("Original String: " + name);
//        System.out.println("Is empty?: " + name.isEmpty());
//        
//        // 6. trim()
//        System.out.println("\n 6. trim() ");
//        System.out.println("Before Trim: "+name);
//        System.out.println("After Trim : "+ name.trim());
//        
//        // 7. replace()
//        System.out.println("\n 7. replace() ");
//        System.out.println("Before Replace: " + name);
//        System.out.println("After Replace : " + name.replace("i", "o"));
//        
//        // 8. toCharArray()
//        System.out.println("\n 8. toCharArray()");
//        char[] letters = name.toCharArray();
//        System.out.println("Converted to array. First letter (index 0) is: " + letters[0]);
//        
//        // 9. nextLine().charAt()
//        System.out.println("\n 9. nextLine().charAt()");
//        System.out.print("Enter name: ");
//        char firstLetter = scan.nextLine().charAt(0);
//        System.out.println("Extracted character at index 0: " + firstLetter);
//        
//        // 10. valueOf()
//        System.out.println("\n 10. valueOf() ");
//        int num = 3;
//        String stringValue = String.valueOf(num);
//        System.out.println("Before (integer type): " + num);
//        System.out.println("After (string type)  : \"" + stringValue + "\"");
//        
//        scan.close();
        
        
//        //Stretch Goal
//        String country = "Philippines";
//        
//        // --- TASK 1: Display first and last character ---
//        char firstChar = country.charAt(0);
//        char lastChar = country.charAt(country.length() - 1);
//        
//        System.out.println("First character: " + firstChar);
//        System.out.println("Last character : " + lastChar);
//        System.out.println("---------------------------------");
//
//        // Variables to keep track of our counts
//        int pCount = 0;
//        int vowelCount = 0;
//
//        // --- TASKS 2 & 3: Loop through the string ---
//        for (int i = 0; i < country.length(); i++) {
//            char currentChar = country.toLowerCase().charAt(i);
//
//            // Count 'P' or 'p'
//            if (currentChar == 'p') {
//                pCount++;
//            }
//
//            // Count vowels (checks both lowercase and uppercase)
//            switch (currentChar) {
//                case 'a': case 'e': case 'i': case 'o': case 'u':
//                    vowelCount++;
//                    break;
//                default:
//                    break; // Ignore consonants
//            }
//        }
//
//        // Display results
//        System.out.println("Total 'P/p' count: " + pCount);
//        System.out.println("Total vowel count: " + vowelCount);
//        
        
        
    }
    
    
    
    
}
