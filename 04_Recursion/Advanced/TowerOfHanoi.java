package Recursion.Questions;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 4;
        TowerOfHanoi(n, "a","b","c");
    }

    public static void TowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + "from" + src + "to" + dest);
            return;
        }
        TowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer Disk " + n + "from" + src + "to" + dest);
        TowerOfHanoi(n - 1, helper, src, dest);
    }
}
