package Recursion;

public class Increasing {
    public static void main(String[] args) {
        int n = 10;
        recursionIncreasing(n);
    }

    public static void recursionIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        recursionIncreasing(n - 1);
        System.out.println(n + " ");

    }
}
