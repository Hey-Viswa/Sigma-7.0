import Basic.reverseaDLL;

public class KthLargestOddNoInAGivenRange {
    /*
     * Kth largest odd number in a given range
    We have two variables L and R, indicating a range of integers from L to R inclusive, and a
    number K, the task is to find Kth largest odd number. If K > number of odd numbers in the range
    L to R then return 0.
    Sample Input 1 : L = -3, R = 3, K = 1
Sample Output 1 : 3
     */
    public static void main(String[] args) {
        
    }
    public static int kthOdd(int[]range,int K){
        if (K <=0) {
            return 0;
        }
        int L = range[0];
        int R = range[1];

        if ((R & 1) > 0) {
            int Count = (int ) Math.ceil((R- L + 1)/ 2);
            if (K > Count) {
                return 0;
            } else {
                return (R-2 * K + 2);
            }
        } else {
            int Count = (int ) Math.ceil((R- L + 1)/ 2);
            if (K > Count) {
                return 0;
            } else {
                return (R - 2 * K + 1);
            }
        }
    }
}
