public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {3,7,9,12,15,17,18};
        int target = 15;
        System.out.println(binary_search(arr,target));
    }
    public static int binary_search(int[] no, int target){
       int start = 0;
       int end = no.length - 1;
       while (start <= end){
         int mid = start + (end - start)/2;
         if (no[mid] == target){
             return  mid;
         }
         if (no[mid] < target){
             start = mid + 1;
         } else {
              end = mid - 1;
         }
       }
       return  -1;
    }
}
