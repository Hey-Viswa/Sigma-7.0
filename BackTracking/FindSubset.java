package BackTracking;

public class FindSubset {
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
    public static void findSubset(String str, String and, int i){
        // base case 
        if (i == str.length()) {
            System.out.println(and);
            return;
        }
        // recursion
        // yes choice
        findSubset(str, and+str.charAt(i), i+1);
        // no choice
        findSubset(str, and, i+1);
    }
}
