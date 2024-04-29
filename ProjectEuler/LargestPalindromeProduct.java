package ProjectEuler;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largest = 0;
        int product = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                product = i * j;
                if (isPalindrome(product) && product > largest) {
                    largest = product;
                }
            }
        }
        System.out.println("Largest: " + largest);
    }
    
    // Function to check if a number is palindrome
    public static boolean isPalindrome(int product) {
        String numString = String.valueOf(product);
        int length = numString.length();
        
        // Compare each character from start to end with its reverse counterpart
        for (int i = 0; i < length / 2; i++) {
            if (numString.charAt(i) != numString.charAt(length - i - 1)) {
                return false; // If any character does not match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }
}
