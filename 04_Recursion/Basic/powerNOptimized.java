package Recursion;

public class powerNOptimized {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(powOpt(x, n));
    }

    public static int powOpt(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int halfPow = powOpt(x, n / 2);
        int halfPowSq = halfPow * halfPow;

        // n is odd
        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
}
