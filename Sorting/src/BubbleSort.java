public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 1, 3, 2};
        System.out.println("Original array:");
        printArr(arr1);
        bubbleSort(arr1);
        System.out.println("Sorted array:");
        printArr(arr1);

        int[] arr2 = {1, 2, 3, 4, 5}; // Already sorted array
        System.out.println("Original array:");
        printArr(arr2);
        bubbleSort(arr2);
        System.out.println("Sorted array:");
        printArr(arr2);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) { // Change return type to void
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }
}