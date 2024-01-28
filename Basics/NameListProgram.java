/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author pc
 */
// an Example usage of List<> in a simple program
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameListProgram {
    public static void main(String[] args) {
        // Create a List to store names
        List<String> nameList = new ArrayList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Menu for user interaction
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a name");
            System.out.println("2. Remove a name");
            System.out.println("3. Display names");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a name
                    System.out.print("Enter a name to add: ");
                    scanner.nextLine(); // Consume the newline character
                    String newName = scanner.nextLine();
                    nameList.add(newName);
                    System.out.println("Name added successfully!");
                    break;

                case 2:
                    // Remove a name
                    if (nameList.isEmpty()) {
                        System.out.println("The list is empty. No names to remove.");
                    } else {
                        System.out.print("Enter the name to remove: ");
                        scanner.nextLine(); // Consume the newline character
                        String nameToRemove = scanner.nextLine();
                        boolean removed = nameList.remove(nameToRemove);
                        if (removed) {
                            System.out.println(nameToRemove + " removed successfully!");
                        } else {
                            System.out.println(nameToRemove + " not found in the list.");
                        }
                    }
                    break;

                case 3:
                    // Display names
                    if (nameList.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Names in the list:");
                        for (String name : nameList) {
                            System.out.println(name);
                        }
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

