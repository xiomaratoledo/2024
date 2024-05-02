import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int secretNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        boolean hasGuessed = false;
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have picked a number between " + min + " and " + max + ". Can you guess it?");
        
        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                hasGuessed = true;
                System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        scanner.close();
    }
}
