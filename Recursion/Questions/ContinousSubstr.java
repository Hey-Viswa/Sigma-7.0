package Recursion.Questions;

public class ContinousSubstr {
    public static void main(String[] args) {
       String str = "abcde";
       int n = str.length();
       System.out.println(countstr(str, 0, n-1, n));
    }
    public static int countstr(String str, int i, int j , int n){
        if (n == 1) {
            return 1;
        }
        if (n<=0) {
            return 0;
        }

        int res = countstr(str, i+ 1, j, n - 1) +
        countstr(str, i, j - 1, n - 1) - countstr(str, i + 1, j - 1, n - 2);
        if (str.charAt( i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
}
