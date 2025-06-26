package BackTracking.Questions;

public class KnightsTour {
    static int N = 8;
    static int[][] board = new int[N][N];

    // All 8 possible moves for a knight
    static int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
    static int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static void main(String[] args) {
        // Initialize board
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = -1;

        // Starting position
        board[0][0] = 0;

        // Try to solve from (0, 0)
        if (solve(0, 0, 1)) {
            printBoard();
        } else {
            System.out.println("No solution exists.");
        }
    }

    // Recursive function to solve knight tour
    public static boolean solve(int x, int y, int moveCount) {
        if (moveCount == N * N)
            return true;

        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (isSafe(nextX, nextY)) {
                board[nextX][nextY] = moveCount;
                if (solve(nextX, nextY, moveCount + 1))
                    return true;

                // Backtrack
                board[nextX][nextY] = -1;
            }
        }
        return false;
    }

    // Check if knight can move to (x, y)
    public static boolean isSafe(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    // Print the board
    public static void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }
}
