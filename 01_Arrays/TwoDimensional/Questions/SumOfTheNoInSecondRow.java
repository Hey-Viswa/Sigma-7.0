package Questions;

/* 
 * Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
 */

public class SumOfTheNoInSecondRow {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 4, 9 }, // index 0
                { 11, 4, 3 }, // index 1 ← This is the "second row"
                { 2, 2, 3 } // index 2
        };
        sum(nums);
    }

    public static void sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[1].length; i++) {
            sum += matrix[1][i];
        }
        System.out.println("sum of the second row: " + sum);
    }
}
