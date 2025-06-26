public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selection(arr);
        BubbleSort.printArr(arr);
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}

