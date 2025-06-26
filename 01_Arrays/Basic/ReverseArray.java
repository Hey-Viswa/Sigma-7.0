public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse_array(int[] no) {
        int first = 0;
        int last = no.length - 1;

        while (first < last) {
            int temp = no[last];
            no[last] = no[first];
            no[first] = temp;
            first++;
            last--;
        }
    }
}
