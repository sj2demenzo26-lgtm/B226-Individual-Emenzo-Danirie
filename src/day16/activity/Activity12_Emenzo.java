/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day16.activity;

/**
 *
 * @author Danirie
 */
public class Activity12_Emenzo {
    
    public static void main(String args[]){
        System.out.println("========== JAVA METHODS ACTIVITY ==========\n");
        
        System.out.println("\n1. Odd or Even ");
        System.out.println(" 1. Odd or Even");
        oddOrEven(1);

        System.out.println("\n2. Print Name ");
        namePrint("Danirie");

        System.out.println("\n3. Square Root ");
        squareRoot(25);

        System.out.println("\n4. Power of a Number ");
        getPower(2, 5);

        System.out.println("\n5. Random Number ");
        printRandomNumber();

        System.out.println("\n6. Area of a Circle ");
        getCircleArea(5);

        System.out.println("\n7. Voter Eligibility ");
        isVoter(20);
        isVoter(16);

        System.out.println("\n8. Word Length ");
        getWordLength("Java");

        System.out.println("\n9. Reverse Word ");
        printWordInReverse("Developer");

        System.out.println("\n10. Personal Information ");
        printIdentity("Danirie L. Emenzo", 23);
        
    }
    
    public static String oddOrEven(int num1) {
        String result;
        if (num1 % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        System.out.println("Result: " + result);
        return result;
    }

    public static String namePrint(String name) {
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". " + name);
        }
        return name;
    }

    public static double squareRoot(int num) {
        double result = Math.sqrt(num);
        System.out.println("Square Root: " + result);
        return result;
    }

    public static double getPower(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to " + exponent + " = " + result);
        return result;
    }

    public static void printRandomNumber() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random Number (1-100): " + randomNumber);
    }

    public static double getCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }

    public static boolean isVoter(int age) {
        boolean voter = age >= 18;
        System.out.println("Age: " + age + " | Eligible to Vote: " + voter);
        return voter;
    }

    public static int getWordLength(String word) {
        int length = (word == null) ? 0 : word.length();
        System.out.println("Word Length: " + length);
        return length;
    }

    public static void printWordInReverse(String word) {
        if (word == null) {
            System.out.println("Word is null");
            return;
        }

        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);
    }

    public static void printIdentity(String name, int age) {
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
    }

    
    
    
}
