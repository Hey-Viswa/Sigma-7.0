package Strings;

public class ShortestPathProblem {
    /*
     * Given a route containing 4 directions (E, W, N, S),
     * find the shortest path to reach destination.
     */
    /*
     * x = 0
     * y = 0
     * n = y + 1
     * s = y - 1
     * w = s - 1
     * e = x + 1
     */
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getPath(path));
    }

    public static float getPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // South
            if (direction == 'S') {
                y--;
            }
            // North
            else if (direction == 'N') {
                y++;
            }
            // West
            else if (direction == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }
}
