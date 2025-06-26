package ArrayList.ImportantQuestions;

import java.util.ArrayList;

public class PairSum1Optimized  {

    // brute force 
    public static boolean pairSum1Optimized(ArrayList<Integer> list,int target) {
        // using 2 pointer approach
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        boolean result = pairSum1(list, target);
        System.out.println("Pair with sum " + target + " exists: " + result);
    }
}
