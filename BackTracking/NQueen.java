package BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // Initialize board with '.'
        initializeBoard(board);

        // Start solving from row 0
        int totalSolutions = placeQueens(board, 0);
        System.out.println("Total Solutions: " + totalSolutions);
    }

    // Initialize the board with '.'
    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
    }

    // Recursive function to place queens
    private static int placeQueens(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return 1;
        }

        int solutions = 0;

        // Try placing queen in each column of current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';              // Place queen
                solutions += placeQueens(board, row + 1); // Recurse to next row
                board[row][col] = 'x';              // Backtrack
            }
        }

        return solutions;
    }

    // Check if queen can be placed at board[row][col]
    private static boolean isSafe(char[][] board, int row, int col) {
        // Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Print the board
    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
