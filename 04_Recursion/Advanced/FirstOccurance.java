package recursion.advanced;

public class FirstOccurance {
    public static void main(String[] args) {
        int arr[] = {6,3,6,9,5,10,2,5,3};
    }   
    public static int fs(int arr[],int key, int i){
        // base case
        if (i == arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return fs(arr, key, i+1);
    } 
}
