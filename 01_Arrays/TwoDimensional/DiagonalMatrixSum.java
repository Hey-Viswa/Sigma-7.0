package Important;

public class DiagonalMatrixSum {
    // public static int diagonal(int matrix[][]) {
    //     int sum = 0;
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (i == j) {
    //                 sum += matrix[i][j];
    //             } else if (i + j == matrix.length - 1) {
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // } 
    /* THE Above Code is not optimized Due to O(N^2), We can still write this in 
     * a linear complexity.
     */
    public static int diagonalOptimized(int matrix[][]){
        // uses O(n) complexity
        int sum = 0;
        for(int i =0; i<matrix.length; i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
            sum+= matrix[i][matrix.length-i-1];
        }
           return sum;
    }
}
