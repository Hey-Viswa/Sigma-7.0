package Recursion;

public class LastOccurance {
    public static void main(String[] args) {
        int arr[] = {6,3,6,9,5,10,2,5,3};

        System.out.println(ls(arr, 5, 0));
    }   
    public static int ls(int arr[],int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = ls(arr, key, i+1);
        if (isFound != -1) {
            return isFound;
        }

        // check with self
        if (arr[i] == key) {
            return i;
        }

        return isFound;
    } 

}
