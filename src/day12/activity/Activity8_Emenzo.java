/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12.activity;

import java.util.Scanner;
public class Activity8_Emenzo {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("\tAverage Calculator");
        System.out.println("=================================");
        
        System.out.print("Enter number of students: ");
        int studentCount = input.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjectCount = input.nextInt();
        
        String[] students = new String[studentCount];
        String[] subjects = new String[subjectCount];
        
        int[][] grades = new int[studentCount][subjectCount]; 
        
        input.nextLine(); // Clear buffer
        System.out.println("\nEnter subject names:");
        
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = input.nextLine();
        }
        
        for (int i = 0; i < students.length; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            students[i] = input.nextLine();
            System.out.println("Enter grades for each subject:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = input.nextInt();
            }
            input.nextLine(); // Clear buffer after numeric loop
        }
        
        System.out.println("\n=======================================================");
        System.out.println("\t\tGrades Report");
        System.out.println("=======================================================");
        
        
        System.out.printf("%-15s", "Student");
        for (int j = 0; j < subjects.length; j++) {
            System.out.printf("%-12s", subjects[j]);
        }
        System.out.println("Average");
        System.out.println("-------------------------------------------------------");
        
        // Print Student Rows
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-15s", students[i]);
            
            double sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("%-12d", grades[i][j]);
                sum += grades[i][j];
            }
            
            double average = sum / subjects.length;
            System.out.printf("%.2f\n", average); 
        }
        
        input.close();
        
        
        
        
    }
    
}
