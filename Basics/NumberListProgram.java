import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberListProgram {
    public static void main(String[] args) {
        // Create a List to store numbers
        List<Double> numberList = new ArrayList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Menu for user interaction
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a number");
            System.out.println("2. Display numbers");
            System.out.println("3. Calculate sum and average");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a number
                    System.out.print("Enter a number to add: ");
                    double newNumber = scanner.nextDouble();
                    numberList.add(newNumber);
                    System.out.println("Number added successfully!");
                    break;

                case 2:
                    // Display numbers
                    if (numberList.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Numbers in the list:");
                        for (Double number : numberList) {
                            System.out.println(number);
                        }
                    }
                    break;

                case 3:
                    // Calculate sum and average
                    if (numberList.isEmpty()) {
                        System.out.println("The list is empty. Cannot calculate sum and average.");
                    } else {
                        double sum = 0;
                        for (Double number : numberList) {
                            sum += number;
                        }
                        double average = sum / numberList.size();

                        System.out.println("Sum: " + sum);
                        System.out.println("Average: " + average);
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
