package DivideAndConquer;

public class rotatedArray {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println("Target index: " + tarIdx);
    }

    public static int search(int arr[], int tar, int si, int ei) {
        int mid = si + (ei - si) / 2;
        // case found 
        if (arr[mid] == tar) {
            return mid;
        }

        // left sorted
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar < arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        // right sorted
        else {
            if (arr[mid] < tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }
}
 