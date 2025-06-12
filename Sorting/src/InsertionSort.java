public class InsertionSort {
    public static void main(String[] args) {

    }

    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            int curr = i;
            int prev = i -1;
            while (prev>= 0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+ 1] = curr;
        }
    }
}
