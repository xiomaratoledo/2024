package April2024;

public class EvenFibonacci {
    public static void main(String[] args) {
        int limit = 4000000; // Define the upper limit
        int a = 0, b = 1, sum = 0;
        int evenSum = 0;
        
        System.out.println("sum: " + sum);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        while (sum <= limit) {
            
            sum = a + b;
            System.out.println("Sum: " + sum);
            a = b;
            System.out.println("a: " + a);
            b = sum;
            System.out.println("b: " + b);

            if (sum % 2 == 0) {
                evenSum += sum;
            }
        }

        System.out.println("Sum of even Fibonacci numbers up to " + limit + " is: " + evenSum);
    }
}

/*
sum a b
0   0 1
1   1 1
2   1 2
3   2 3
5   3 5
8   5 8
*/
