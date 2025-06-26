package Recursion;

/**
 * FIBONACCI SEQUENCE - Classic Recursion/Dynamic Programming
 * 
 * Problem: Generate Fibonacci numbers where F(n) = F(n-1) + F(n-2)
 * 
 * Companies: Amazon, Google, Microsoft, Facebook, Adobe, Apple
 * Difficulty: Easy-Medium (optimization makes it medium)
 * Topics: Recursion, Dynamic Programming, Memoization
 * 
 * Time Complexity: O(2^n) - naive recursion, O(n) - with memoization
 * Space Complexity: O(n) - recursion stack or memoization array
 * 
 * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 */
class Fibonaccai {

    public static void main(String[] args) {
        int n = 15; // Reduced from 100 to avoid excessive computation

        System.out.println("=== Fibonacci Sequence ===");
        System.out.print("First " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\n=== Performance Comparison ===");
        int testN = 10;

        // Test naive recursion
        long start = System.nanoTime();
        int result1 = fibonacci(testN);
        long time1 = System.nanoTime() - start;
        System.out.println("Naive Recursion F(" + testN + ") = " + result1 + " | Time: " + time1 / 1000 + " μs");

        // Test memoized version
        start = System.nanoTime();
        int result2 = fibonacciMemoized(testN, new int[testN + 1]);
        long time2 = System.nanoTime() - start;
        System.out.println("Memoized F(" + testN + ") = " + result2 + " | Time: " + time2 / 1000 + " μs");
    }

    /**
     * Naive recursive Fibonacci (inefficient for large n)
     * 
     * Recurrence: F(n) = F(n-1) + F(n-2)
     * Base cases: F(0) = 0, F(1) = 1
     * 
     * @param n - position in Fibonacci sequence
     * @return nth Fibonacci number
     */
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Optimized Fibonacci with memoization
     * Stores previously computed values to avoid recomputation
     * 
     * @param n    - position in Fibonacci sequence
     * @param memo - memoization array
     * @return nth Fibonacci number
     */
    public static int fibonacciMemoized(int n, int[] memo) {
        // Base cases
        if (n == 0 || n == 1) {
            return n;
        }

        // Check if already computed
        if (memo[n] != 0) {
            return memo[n];
        }

        // Compute and store result
        memo[n] = fibonacciMemoized(n - 1, memo) + fibonacciMemoized(n - 2, memo);
        return memo[n];
    }

    /**
     * Iterative Fibonacci (most efficient)
     * Time: O(n), Space: O(1)
     */
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int prev2 = 0, prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
