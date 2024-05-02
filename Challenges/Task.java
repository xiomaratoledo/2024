import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[X] " : "[ ] ") + name;
    }
}

public class TaskTracker {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Task Tracker!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    tasks.add(new Task(taskName));
                    System.out.println("Task added!");
                    break;
                case 2:
                    markTaskAsCompleted(scanner);
                    break;
                case 3:
                    viewAllTasks();
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Task Tracker. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        scanner.close();
    }

    private static void markTaskAsCompleted(Scanner scanner) {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.print("Enter task number to mark as completed: ");
        int taskIndex = scanner.nextInt();
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            tasks.get(taskIndex - 1).markCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void viewAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void deleteTask(Scanner scanner) {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.print("Enter task number to delete: ");
        int taskIndex = scanner.nextInt();
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            tasks.remove(taskIndex - 1);
            System.out.println("Task deleted!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
