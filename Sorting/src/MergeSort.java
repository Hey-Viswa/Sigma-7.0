public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        merge(arr, 0, arr.length- 1);
    }

    public static void merge(int arr[], int si, int ei){
        int mid = (si + ei) / 2;// start
        merge(arr, si,mid); // left part
        merge(arr, mid+1, ei);
    }

}