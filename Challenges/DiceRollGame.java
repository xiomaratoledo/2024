import java.util.Random;
import java.util.Scanner;

public class DiceRollGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Dice Rolling Game!");

        while (true) {
            System.out.println("\nPress Enter to roll the dice (or type 'exit' to quit):");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int diceResult = random.nextInt(6) + 1; // Roll a 6-sided dice

            System.out.println("You rolled: " + diceResult);

            if (diceResult == 6) {
                System.out.println("Congratulations! You rolled a 6. You win!");
            } else {
                System.out.println("Sorry, you didn't roll a 6. Try again!");
            }
        }

        System.out.println("\nThanks for playing the Dice Rolling Game!");
        scanner.close();
    }
}
