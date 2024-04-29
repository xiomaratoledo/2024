package ProjectEuler;

package ProjectEuler;

public class SmallestMultiple {
    public static void main(String[] args) {
        int limit = 20;
        long lcm = findLCM(limit);
        System.out.println("The smallest positive number evenly divisible by all numbers from 1 to " + limit + " is: " + lcm);
    }

    // Function to find the least common multiple (LCM)
    public static long findLCM(int limit) {
        long lcm = 1;
        for (int i = 2; i <= limit; i++) {
            lcm = lcm(lcm, i);
        }
        return lcm;
    }

    // Function to find the least common multiple (LCM) of two numbers
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    // Function to find the greatest common divisor (GCD) using Euclid's algorithm
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

