package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int fact = recursionFactorial(5);
        System.out.println(fact);
    }
    public static int recursionFactorial(int n ){
        if(n < 0){
            return -1;
        }

        if(n == 0){
            return 1;
        }
        int fn1 = recursionFactorial(n-1);
        int fn = n * recursionFactorial(n-1);
        return fn;
    }
}
