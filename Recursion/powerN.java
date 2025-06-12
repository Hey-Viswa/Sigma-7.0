package Recursion;

public class powerN {
    public static void main(String[] args) {
        System.out.println(powe(2, 10));
    }
    public static int powe(int x, int n){
        if (n == 0) {
            return 1; 
        }
        int xnm1 = powe(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
}
