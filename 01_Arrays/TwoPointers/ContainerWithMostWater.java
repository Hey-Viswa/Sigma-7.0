package ArrayList.ImportantQuestions;

import java.util.ArrayList;

/**
 * CONTAINER WITH MOST WATER - Two Pointer Algorithm
 * 
 * Problem: Given heights of vertical lines, find two lines that can hold
 * maximum water
 * 
 * Companies: Amazon, Google, Facebook, Microsoft, Apple, Flipkart
 * Difficulty: Medium
 * Topics: Two Pointers, Arrays, Greedy Algorithm
 * 
 * Time Complexity: O(n²) - brute force, O(n) - optimized two pointer
 * Space Complexity: O(1) - constant extra space
 * 
 * Key Insight: Water level = min(height[i], height[j]) × (j - i)
 * Optimization: Use two pointers from both ends, move the shorter line
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // Test case: [1,8,6,2,5,4,8,3,7]
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Height array: " + height);
        System.out.println("Brute Force Result: " + storeWaterBruteForce(height));
        System.out.println("Optimized Result: " + storeWaterOptimized(height));
    }

    /**
     * Brute Force Approach - Check all possible pairs
     * Time Complexity: O(n²), Space Complexity: O(1)
     * 
     * @param height - ArrayList containing heights of vertical lines
     * @return maximum water that can be stored
     */
    public static int storeWaterBruteForce(ArrayList<Integer> height) {
        int maxWater = 0;

        // Check all possible pairs of lines
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                // Water level is determined by shorter line
                int waterHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currentWater = waterHeight * width;
                maxWater = Math.max(maxWater, currentWater);
            }
        }

        return maxWater;
    }

    /**
     * Optimized Two Pointer Approach
     * Time Complexity: O(n), Space Complexity: O(1)
     * 
     * Algorithm:
     * 1. Start with pointers at both ends
     * 2. Calculate water with current pointers
     * 3. Move the pointer with smaller height (greedy choice)
     * 4. Continue until pointers meet
     * 
     * @param height - ArrayList containing heights of vertical lines
     * @return maximum water that can be stored
     */
    public static int storeWaterOptimized(ArrayList<Integer> height) {
        int maxWater = 0;
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            // Calculate water with current pointers
            int waterHeight = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currentWater = waterHeight * width;
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer with smaller height
            // (moving the taller one won't help as water level is limited by shorter one)
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    /**
     * Alternative method name for compatibility
     */
    public static int storeWater(ArrayList<Integer> height) {
        return storeWaterOptimized(height);
    }
}
