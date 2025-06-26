/**
 * TILING PROBLEM - Dynamic Programming/Recursion
 * 
 * Problem: Given a 2×n board and tiles of size 2×1, count the number of ways to
 * tile the board
 * 
 * Companies: Amazon, Microsoft, Google, Adobe, Flipkart
 * Difficulty: Medium
 * Topics: Recursion, Dynamic Programming, Fibonacci Pattern
 * 
 * Time Complexity: O(2^n) - without memoization, O(n) - with memoization
 * Space Complexity: O(n) - recursion stack
 * 
 * Similar to: Fibonacci, Climbing Stairs, House Robber
 */
public class TileProblem {

    public static void main(String[] args) {
        System.out.println("Number of ways to tile 2x3 board: " + tilingProblem(3));
        System.out.println("Number of ways to tile 2x4 board: " + tilingProblem(4));
        System.out.println("Number of ways to tile 2x5 board: " + tilingProblem(5));
    }

    /**
     * Calculate number of ways to tile a 2×n board
     * 
     * Approach:
     * - For each position, we can either place:
     * 1. One vertical tile (takes 1 column) → tilingProblem(n-1)
     * 2. Two horizontal tiles (takes 2 columns) → tilingProblem(n-2)
     * 
     * Recurrence: f(n) = f(n-1) + f(n-2)
     * Base cases: f(0) = 1, f(1) = 1
     * 
     * @param n - width of the 2×n board
     * @return number of ways to tile the board
     */
    public static int tilingProblem(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive relation: place vertical tile OR two horizontal tiles
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    /**
     * Optimized version using Dynamic Programming (Memoization)
     * Time Complexity: O(n), Space Complexity: O(n)
     */
    public static int tilingProblemDP(int n) {
        if (n <= 1)
            return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}