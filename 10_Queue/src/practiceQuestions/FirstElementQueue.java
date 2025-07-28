import java.io.*;
import java.util.*;

public class FirstElementQueue {
    
    // Cell class to represent a position on the chessboard
    static class Cell {
        int x, y;
        int dis;
        
        public Cell(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    
    // Check if the position is within the chessboard
    static boolean isInside(int x, int y, int N) {
        return x >= 1 && x <= N && y >= 1 && y <= N;
    }
    
    // Find minimum steps for knight to reach target position
    // Time Complexity: O(N²) where N is the size of chessboard
    // Space Complexity: O(N²) for the visited array and queue
    static int minStepToReachTarget(int knightPos[], int targetPos[], int N) {
        // All possible moves of a knight
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
        
        // Queue for BFS
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(knightPos[0], knightPos[1], 0));
        
        // Visited array to avoid revisiting cells
        boolean visit[][] = new boolean[N + 1][N + 1];
        visit[knightPos[0]][knightPos[1]] = true;
        
        while (!q.isEmpty()) {
            Cell t = q.poll();
            
            // If we reached the target, return the distance
            if (t.x == targetPos[0] && t.y == targetPos[1])
                return t.dis;
            
            // Check all 8 possible moves
            for (int i = 0; i < 8; i++) {
                int x = t.x + dx[i];
                int y = t.y + dy[i];
                
                if (isInside(x, y, N) && !visit[x][y]) {
                    visit[x][y] = true;
                    q.add(new Cell(x, y, t.dis + 1));
                }
            }
        }
        
        return Integer.MAX_VALUE; // Target unreachable
    }
    
    public static void main(String[] args) {
        int N = 30;
        int knightPos[] = { 1, 1 };
        int targetPos[] = { 30, 30 };
        
        int result = minStepToReachTarget(knightPos, targetPos, N);
        System.out.println("Minimum steps required: " + result);
    }
}
