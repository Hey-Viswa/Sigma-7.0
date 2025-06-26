/**
 * BINARY SEARCH ALGORITHM
 * 
 * Problem: Search for a target element in a sorted array
 * 
 * Companies: Google, Amazon, Microsoft, Facebook, Apple, Netflix, Adobe
 * Difficulty: Easy-Medium
 * Topics: Divide and Conquer, Searching, Arrays
 * 
 * Time Complexity: O(log n) - halves search space each iteration
 * Space Complexity: O(1) - iterative approach, O(log n) - recursive
 * 
 * Prerequisite: Array must be sorted
 * Applications: Database searching, finding insertion point, range queries
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 3, 7, 9, 12, 15, 17, 18 };
        int target = 15;

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: " + target);

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        // Test edge cases
        System.out.println("\n=== Testing Edge Cases ===");
        System.out.println("Search for 3 (first element): " + binarySearch(arr, 3));
        System.out.println("Search for 18 (last element): " + binarySearch(arr, 18));
        System.out.println("Search for 1 (not exists): " + binarySearch(arr, 1));
        System.out.println("Search for 20 (not exists): " + binarySearch(arr, 20));
    }

    /**
     * Binary Search Implementation (Iterative)
     * 
     * Algorithm:
     * 1. Set start = 0, end = array.length - 1
     * 2. While start <= end:
     * - Calculate mid = start + (end - start) / 2
     * - If arr[mid] == target, return mid
     * - If arr[mid] < target, search right half (start = mid + 1)
     * - If arr[mid] > target, search left half (end = mid - 1)
     * 3. Return -1 if not found
     * 
     * @param arr    - sorted array to search in
     * @param target - element to find
     * @return index of target if found, -1 otherwise
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Calculate mid to avoid integer overflow
            int mid = start + (end - start) / 2;

            // Target found
            if (arr[mid] == target) {
                return mid;
            }

            // Target is in right half
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // Target is in left half
            else {
                end = mid - 1;
            }
        }

        return -1; // Target not found
    }

    /**
     * Binary Search Implementation (Recursive)
     * More intuitive but uses O(log n) space for recursion stack
     * 
     * @param arr    - sorted array to search in
     * @param target - element to find
     * @param start  - starting index
     * @param end    - ending index
     * @return index of target if found, -1 otherwise
     */
    public static int binarySearchRecursive(int[] arr, int target, int start, int end) {
        // Base case: search space exhausted
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Search in left half
        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, start, mid - 1);
        }
        // Search in right half
        else {
            return binarySearchRecursive(arr, target, mid + 1, end);
        }
    }
}
