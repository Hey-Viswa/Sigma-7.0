package BackTracking;

/**
 * N-QUEENS PROBLEM - Classic Backtracking Algorithm
 * 
 * Problem: Place N queens on an N×N chessboard such that no two queens attack
 * each other
 * 
 * Companies: Google, Amazon, Microsoft, Facebook, Apple, Adobe
 * Difficulty: Hard
 * Topics: Backtracking, Recursion, Chess Problem
 * 
 * Time Complexity: O(N!) - exponential in nature
 * Space Complexity: O(N²) - for the board + O(N) for recursion stack
 * 
 * Key Concepts:
 * - Queens attack horizontally, vertically, and diagonally
 * - Use backtracking to try all possibilities
 * - Check safety before placing each queen
 */
public class NQueen {

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // Initialize board with 'x' (empty cells)
        initializeBoard(board);

        // Start solving from row 0
        System.out.println("=== N-Queens Problem Solutions for " + n + "x" + n + " board ===");
        int totalSolutions = placeQueens(board, 0);
        System.out.println("Total Solutions Found: " + totalSolutions);
    }

    /**
     * Initialize the board with 'x' representing empty cells
     */
    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
    }

    /**
     * Recursive function to place queens using backtracking
     * 
     * @param board - the chessboard
     * @param row   - current row to place queen
     * @return number of valid solutions from this state
     */
    private static int placeQueens(char[][] board, int row) {
        // Base case: all queens placed successfully
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return 1;
        }

        int solutions = 0;

        // Try placing queen in each column of current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place queen
                solutions += placeQueens(board, row + 1); // Recurse to next row
                board[row][col] = 'x'; // Backtrack (remove queen)
            }
        }

        return solutions;
    }

    /**
     * Check if queen can be safely placed at board[row][col]
     * Queens attack horizontally, vertically, and diagonally
     * 
     * @param board - the chessboard
     * @param row   - row position to check
     * @param col   - column position to check
     * @return true if position is safe, false otherwise
     */
    private static boolean isSafe(char[][] board, int row, int col) {
        // Check column above (vertical attack)
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true; // Position is safe
    }

    /**
     * Print the current state of the board
     * 'Q' represents a queen, 'x' represents an empty cell
     */
    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
