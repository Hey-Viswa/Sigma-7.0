package Recursion;

class Fibonaccai {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonaccai(i) + " ");
        }
    }
    public static int fibonaccai(int n){
        if ( n == 0 || n == 1){
            return n;
        }
        return fibonaccai(n - 1) + fibonaccai(n - 2);
    }

}
