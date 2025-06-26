/**
 * BUBBLE SORT ALGORITHM
 * 
 * Companies: Basic algorithm asked in Amazon, Microsoft, Google, Flipkart
 * Time Complexity: O(n²) worst/average case, O(n) best case (optimized version)
 * Space Complexity: O(1) - in-place sorting
 * 
 * Approach: Compare adjacent elements and swap if they're in wrong order
 * Optimization: Stop early if no swaps occur in a pass (array is sorted)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = { 5, 4, 1, 3, 2 };
        System.out.println("Original array:");
        printArr(arr1);
        bubbleSort(arr1);
        System.out.println("Sorted array:");
        printArr(arr1);

        int[] arr2 = { 1, 2, 3, 4, 5 }; // Already sorted array - demonstrates optimization
        System.out.println("\nAlready sorted array:");
        printArr(arr2);
        bubbleSort(arr2);
        System.out.println("Sorted array:");
        printArr(arr2);
    }

    /**
     * Helper method to print array elements
     */
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Bubble Sort with optimization
     * Stops early if array becomes sorted before all passes
     * 
     * @param arr - array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false; // Flag to track if any swap occurred

            // Last 'turn' elements are already in place
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping occurred, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}