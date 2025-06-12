/**
 * This class provides a method to calculate the amount of water that can be trapped
 * between the bars of a histogram-like elevation map after rainfall.
 */
public class TrappingRainWater {

    /**
     * The main method serves as the entry point for the program.
     * Currently, it does not contain any example usage or logic.
     */
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }

    /**
     * Calculates the total amount of water that can be trapped between the bars
     * of the given elevation map.
     *
     * @param height An array of integers representing the elevation map, where each
     *               element is the height of a bar.
     * @return The total amount of trapped water.
     */
    public static int trappedRainWater(int[] height) {
        int n = height.length; // Length of the elevation map array

        // Calculate the left max boundary for each bar
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; // Initialize the first element of leftMax
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]); // Update leftMax for each bar
        }

        // Calculate the right max boundary for each bar
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; // Initialize the last element of rightMax
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // Update rightMax for each bar
        }

        int trappedWater = 0; // Variable to store the total trapped water

        // Calculate the trapped water for each bar
        for (int i = 0; i < n; i++) {
            // Water level at the current bar is the minimum of leftMax and rightMax
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped water is the water level minus the height of the current bar
            trappedWater += waterLevel - height[i];
        }

        return trappedWater; // Return the total trapped water
    }
}