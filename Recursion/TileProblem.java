// Amazon wala Question ha bhai

public class TileProblem {

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }

    public static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

}