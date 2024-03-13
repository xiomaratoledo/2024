import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reversedNumber = reverse(number);
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // a. Extract the last digit of the input number
            reversedNumber = reversedNumber * 10 + digit; // b. Append the extracted digit to the reversedNumber
            number /= 10; // c. Remove the last digit from the input number
        }
        return reversedNumber;
    }
}

/*
1. Start
2. Input the number to be reversed
3. Initialize reversedNumber to 0
4. While the input number is not equal to 0:
     a. Extract the last digit of the input number
     b. Append the extracted digit to the reversedNumber
     c. Remove the last digit from the input number
5. End loop
6. Output the reversedNumber
7. End
*/

