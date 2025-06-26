/**
 * MERGE SORT ALGORITHM - Divide and Conquer
 * 
 * Problem: Sort an array using divide and conquer approach
 * 
 * Companies: Google, Amazon, Microsoft, Facebook, Apple, Adobe
 * Difficulty: Medium
 * Topics: Divide and Conquer, Recursion, Sorting
 * 
 * Time Complexity: O(n log n) - consistent for all cases
 * Space Complexity: O(n) - for temporary arrays during merging
 * 
 * Advantages: Stable sort, consistent performance, good for large datasets
 * Applications: External sorting, sorting linked lists, merge operations
 */
public class MergeSort {

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, 1, 4 };

        System.out.println("=== Merge Sort Algorithm ===");
        System.out.print("Original array: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        printArray(arr);

        // Test with edge cases
        System.out.println("\n=== Edge Cases ===");

        // Single element
        int[] singleElement = { 42 };
        System.out.print("Single element: ");
        printArray(singleElement);
        mergeSort(singleElement, 0, singleElement.length - 1);
        System.out.print("After sorting: ");
        printArray(singleElement);

        // Already sorted
        int[] sorted = { 1, 2, 3, 4, 5 };
        System.out.print("Already sorted: ");
        printArray(sorted);
        mergeSort(sorted, 0, sorted.length - 1);
        System.out.print("After sorting: ");
        printArray(sorted);

        // Reverse sorted
        int[] reverse = { 5, 4, 3, 2, 1 };
        System.out.print("Reverse sorted: ");
        printArray(reverse);
        mergeSort(reverse, 0, reverse.length - 1);
        System.out.print("After sorting: ");
        printArray(reverse);
    }

    /**
     * Main merge sort function - divides array into halves
     * 
     * Algorithm:
     * 1. Divide array into two halves
     * 2. Recursively sort both halves
     * 3. Merge the sorted halves
     * 
     * @param arr - array to sort
     * @param si  - start index
     * @param ei  - end index
     */
    public static void mergeSort(int arr[], int si, int ei) {
        // Base case: single element or invalid range
        if (si >= ei) {
            return;
        }

        // Calculate middle point (avoid overflow)
        int mid = si + (ei - si) / 2;

        // Recursively sort left and right halves
        mergeSort(arr, si, mid); // Sort left half
        mergeSort(arr, mid + 1, ei); // Sort right half

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    /**
     * Merge function - combines two sorted subarrays
     * 
     * Merges arr[si...mid] and arr[mid+1...ei] into sorted order
     * 
     * @param arr - array containing subarrays to merge
     * @param si  - start index of first subarray
     * @param mid - end index of first subarray
     * @param ei  - end index of second subarray
     */
    public static void merge(int arr[], int si, int mid, int ei) {
        // Create temporary array for merged result
        int temp[] = new int[ei - si + 1];

        int i = si; // Iterator for left subarray
        int j = mid + 1; // Iterator for right subarray
        int k = 0; // Iterator for temp array

        // Merge elements in sorted order
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right subarray
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy merged elements back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    /**
     * Helper method to print array
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}