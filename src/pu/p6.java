package pu;
import java.util.Scanner;

public class p6 {
    public static int fibonacciRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive function to compute the nth Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {

            int first = 1;
            int second = 1;
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = first + second;
                first = second;
                second = fib;



            }
            return fib;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println();

        System.out.println("Using the recursive function: " + fibonacciRecursive(n));

        System.out.println("Using the non-recursive function: " + fibonacciNonRecursive(n));
    }
}


