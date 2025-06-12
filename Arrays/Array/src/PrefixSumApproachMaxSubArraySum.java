import javax.swing.*;

public class PrefixSumApproachMaxSubArraySum {
    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};
        prefixSum(num);
    }

    public static void prefixSum(int[] num) {
        int currentSum = 0;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        int maxSum = Integer.MIN_VALUE; // Changed initialization to Integer.MIN_VALUE
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currentSum = start == 0
                        ? prefix[end]
                        : prefix[end] - prefix[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
}