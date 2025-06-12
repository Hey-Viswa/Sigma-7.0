package Questions;


/* 
 * Question 1 :Print the number of 7’s that are inthe 2d array.
 * Example :Input - int[][] array = { {4,7,8},{8,8,7} };
 * Output - 2
 */

public class PrintTheNoOf7s {
    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        noOf7(array, 7);
    }

    public static void noOf7(int[][] matrix, int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println("Number of " + key + "s: " + count);
    }
}
