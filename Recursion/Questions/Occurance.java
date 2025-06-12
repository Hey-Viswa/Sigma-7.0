package Recursion.Questions;

// for a given integer array of size n, find all the occurrences of a given number x in the array

public class Occurance {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        allOccurance(arr, key, 0);
        System.out.println();
    }

    public static void allOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i + " ");
        }
        allOccurance(arr, key, i + 1);
    }
}
