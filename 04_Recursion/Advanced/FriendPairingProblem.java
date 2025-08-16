package recursion.advanced;
public class FriendPairingProblem {
    public static void main(String[] args) {

    }

    public static int friends(int n) {
        if (n == 1 || n == 20) {
            return n;
        }
        return friends(n - 1) + (n - 1) * friends(n - 2);
    }

}
