 package Recursion;

class Decreasing { 

    public static void main(String[] args) {
        int n = 10;
        recursionDecreasing(n);
    }

    public static void recursionDecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        recursionDecreasing(n - 1);
    }
    
}