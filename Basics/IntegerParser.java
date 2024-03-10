import java.util.Scanner;

public class IntegerParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();
            int number = parseInt(input);
            System.out.println("Parsed integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    public static int parseInt(String input) throws NumberFormatException {
        // Attempt to parse the input string into an integer
        return Integer.parseInt(input);
    }
}
