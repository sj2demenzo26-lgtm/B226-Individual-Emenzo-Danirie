package day25.activity;

import java.util.Scanner;
import java.util.ArrayList;

public class Activity16_Emenzo {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String args[]) {
        // Welcome Banner
        System.out.println("========================================");
        System.out.println("||\t   TO-DO LIST MANAGER\t      ||");
        System.out.println("========================================");
        
        while (true) {
            
            System.out.println("\n=== MENU ===\n");
            System.out.println("[1] Add a task");
            System.out.println("[2] View all tasks");
            System.out.println("[3] Update a task");
            System.out.println("[4] Remove a task");
            System.out.println("[5] Clear all tasks");
            System.out.println("[6] Exit");
            
            // Get user input   
            System.out.print("\nChoice: ");
            int choice = scan.nextInt();
            scan.nextLine(); // Clear scanner buffer
            
            switch (choice) {
                case 1: 
                    System.out.println("\n========================================");
                    System.out.println("\n=== ADD TASK ===\n");
                    System.out.print("Enter new task: ");
                    String newTask = scan.nextLine();
                    tasks.add(newTask);
                    System.out.println("New task successfully Added!");
                    System.out.println("\n========================================");
                    break;
                
                case 2: 
                    System.out.println("\n========================================");
                    System.out.println("\n=== VIEW ALL TASK ===\n");
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println("[" + i + "] " + tasks.get(i));
                        }
                    }
                    System.out.println("\n========================================");
                    break;
                
                case 3: 
                    System.out.println("\n========================================");
                    System.out.println("\n=== UPDATE A TASK ===\n");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to update!");
                    } else {
                        // Display current tasks with index numbers
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println("[" + i + "] " + tasks.get(i));
                        }
                        
                        System.out.print("\nIndex of the task you want to update: ");
                        int updateIndex = scan.nextInt();
                        scan.nextLine(); // Clear buffer
                        
                        // Validate index
                        if (updateIndex >= 0 && updateIndex < tasks.size()) {
                            System.out.println("\nCurrent task: " + tasks.get(updateIndex));
                            System.out.print("Enter updated task: ");
                            String updatedTask = scan.nextLine();
                            tasks.set(updateIndex, updatedTask);
                            System.out.println("\nSuccessfully Updated!");
                        } else {
                            System.out.println("Invalid Index!");
                        }
                    }
                    System.out.println("\n========================================");
                    break;
                
                case 4: 
                    System.out.println("\n========================================");
                    System.out.println("\n=== REMOVE A TASK ===\n");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to remove!");
                    } else {
                        // Display current tasks with index numbers
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println("[" + i + "] " + tasks.get(i));
                        }
                        
                        System.out.print("\nIndex of the task you want to remove: ");
                        int removeIndex = scan.nextInt();
                        scan.nextLine(); // Clear buffer
                        
                        // Validate index
                        if (removeIndex >= 0 && removeIndex < tasks.size()) {
                            String removed = tasks.remove(removeIndex);
                            System.out.println("\nSuccessfully task removed: \"" + removed + "\"");
                        } else {
                            System.out.println("\nInvalid Index!");
                        }
                    }
                    System.out.println("\n");
                    break;
                
                case 5: 
                    System.out.println("\n========================================");
                    System.out.println("\n=== CLEAR ALL TASKS ===\n");
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is already empty!");
                    } else {
                        tasks.clear(); // Using standard ArrayList clear() method
                        System.out.println("All tasks successfully removed!");
                    }
                    System.out.println("\n========================================");
                    break;
                
                case 6: 
                    System.out.println("\n========================================");
                    System.out.println("\nExiting program...");
                    System.exit(0);
                    break;
                
                default: 
                    System.out.println("Invalid choice! Please choose between 1 and 6.");
            }
        }
    }
}