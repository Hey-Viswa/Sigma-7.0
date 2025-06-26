/**
 * KADANE'S ALGORITHM - Maximum Subarray Sum
 * 
 * Problem: Find the maximum sum of any contiguous subarray
 * 
 * Companies: Google, Amazon, Microsoft, Facebook, Apple, Netflix, Adobe
 * Difficulty: Medium
 * Topics: Dynamic Programming, Arrays, Greedy Algorithm
 * 
 * Time Complexity: O(n) - single pass through array
 * Space Complexity: O(1) - only using two variables
 * 
 * Key Insight: At each position, decide whether to extend existing subarray
 * or start a new subarray from current element
 */
public class KadaneAlgorithm {

  public static void main(String[] args) {
    int numbers[] = { 1, -3, 4, -1, -2, 1, 5 };
    System.out.println("Array: " + java.util.Arrays.toString(numbers));
    kadane(numbers);

    // Test with all negative numbers
    int negative[] = { -2, -3, -1, -5 };
    System.out.println("\nArray: " + java.util.Arrays.toString(negative));
    kadane(negative);
  }

  /**
   * Kadane's Algorithm implementation
   * 
   * Logic:
   * - Keep track of current sum (cs) and maximum sum (ms)
   * - If current sum becomes negative, reset it to 0
   * - Update maximum sum at each step
   * 
   * @param numbers - input array
   */
  public static void kadane(int[] numbers) {
    int maxSum = Integer.MIN_VALUE; // Maximum sum found so far
    int currentSum = 0; // Current subarray sum

    for (int number : numbers) {
      currentSum += number;

      // Update maximum sum if current sum is greater
      maxSum = Math.max(currentSum, maxSum);

      // If current sum becomes negative, reset to 0
      // (start new subarray from next element)
      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    System.out.println("Maximum subarray sum: " + maxSum);
  }
}

/**
 * LeetCode style solution class
 * Problem: https://leetcode.com/problems/maximum-subarray/
 */
class Solution {

  /**
   * Alternative implementation that handles edge case differently
   * This version updates maxSum before checking if currentSum < 0
   * 
   * @param numbers - input array
   * @return maximum subarray sum
   */
  public int maxSubArray(int[] numbers) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for (int number : numbers) {
      currentSum += number;

      // Update maxSum first
      if (currentSum > maxSum) {
        maxSum = currentSum;
      }

      // Reset currentSum if it becomes negative
      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    return maxSum;
  }
}
