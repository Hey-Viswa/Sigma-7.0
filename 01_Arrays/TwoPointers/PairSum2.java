package ArrayList.ImportantQuestions;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {

    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) { // breaking point
                bp = i;
                break;
            }
        }
        int lp = (bp + 1) % n;
        int rp = bp;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
}
