package Questions;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        // Correct: 2 rows, 3 columns
        transpose(matrix, 2, 3);
    }

    public static void transpose(int[][] matrix, int row, int col) {
        int[][] transpose = new int[col][row]; // Note: flipped dimensions

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
