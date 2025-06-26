package BackTracking;

public class FindPermutation {
    private static char curr;

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }

    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            curr = str.charAt(i);
           String Newstr = str.substring(0, i) + str.substring(i + 1);
            permutation(Newstr, ans + curr);
        }
    }
}
