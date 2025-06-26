package Recursion;

/**
 * FACTORIAL CALCULATION - Basic Recursion
 * 
 * Problem: Calculate n! = n × (n-1) × (n-2) × ... × 1
 * 
 * Companies: Amazon, Microsoft, Google, TCS, Wipro (Basic recursion
 * understanding)
 * Difficulty: Easy
 * Topics: Recursion, Mathematical computation
 * 
 * Time Complexity: O(n) - n recursive calls
 * Space Complexity: O(n) - recursion stack depth
 * 
 * Base Case: 0! = 1, negative numbers return -1 (error)
 * Recurrence: n! = n × (n-1)!
 */
public class Factorial {

    public static void main(String[] args) {
        // Test cases
        int[] testCases = { 0, 1, 5, 10, -1 };

        System.out.println("=== Factorial Calculations ===");
        for (int n : testCases) {
            int result = factorial(n);
            if (result == -1) {
                System.out.println(n + "! = Invalid (negative number)");
            } else {
                System.out.println(n + "! = " + result);
            }
        }
    }

    /**
     * Calculate factorial using recursion
     * 
     * Algorithm:
     * - Base case: if n == 0, return 1
     * - Recursive case: return n × factorial(n-1)
     * - Error case: if n < 0, return -1
     * 
     * @param n - number to calculate factorial for
     * @return factorial of n, or -1 if invalid input
     */
    public static int factorial(int n) {
        // Error case: negative numbers
        if (n < 0) {
            return -1;
        }

        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n! = n × (n-1)!
        return n * factorial(n - 1);
    }

    /**
     * Iterative version for comparison
     * Time Complexity: O(n), Space Complexity: O(1)
     */
    public static int factorialIterative(int n) {
        if (n < 0)
            return -1;

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
