public class SumOfSubArray {
    public static void main(String[] args) {
        int[] subarr = {1, 2, 3, 4, 5};
        int sos = sumofsubarray(subarr);
        System.out.println(sos);
    }

    public static int sumofsubarray(int[] num) {
        int largest = Integer.MIN_VALUE; // -  infinity
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int currSum = 0;
                for (int k = 0; k <= j; k++) {
                    currSum += num[k];
                    System.out.print(num[k] + " ");
                }
                System.out.println(" => Sum: " + currSum);
                if (largest < currSum) {
                    largest = currSum;
                }
                if (smallest > currSum) {
                    smallest = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The maximum Sub array sum is: " + largest);
        System.out.println("The minimum Sub array sum is: " + smallest);
        return largest;
    }
}
