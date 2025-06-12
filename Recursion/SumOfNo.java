package Recursion;

public class SumOfNo {

    public static void main(String[] args) {
        int n = 10;
        int res = calcSum(n);
        System.out.println(res );
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int sn = n + Snm1;
        return sn;
    }

}