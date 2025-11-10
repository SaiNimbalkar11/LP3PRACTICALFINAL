package Daapractical;

import java.util.Scanner;

public class A1_1 {

    // --- Recursive function to print Fibonacci series ---
    public static void printFibonacciRecursive(int a, int b, int n) {
        if (n == 0)
            return;
        System.out.print(a + " ");
        printFibonacciRecursive(b, a + b, n - 1);
    }

    // --- Iterative function to print Fibonacci series ---
    public static void printFibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // --- Iterative Approach ---
        System.out.println("\nIterative Fibonacci Series:");
        printFibonacciIterative(n);
        System.out.println("\nTime Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");

        // --- Recursive Approach ---
        System.out.println("\n\nRecursive Fibonacci Series:");
        printFibonacciRecursive(0, 1, n);
        System.out.println("\nTime Complexity: O(n)");
        System.out.println("Space Complexity: O(n) (due to recursion stack)");
    }
}
