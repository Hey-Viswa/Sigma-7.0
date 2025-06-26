package ArrayList.ImportantQuestions.exerciseQuestions;

import java.util.ArrayList;

public class BeautifulArrayList {
    public static void main(String[] args) {
       
        System.out.println(beautifulArrayList(5));
        System.out.println(beautifulArrayListUsingDivideAndConquer(5));
    }

    public static ArrayList<Integer> beautifulArrayList(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (e * 2 <= n) {
                    temp.add(e * 2);
                }
            }
            for (Integer e : ans) {
                if (e * 2 - 1 <= n) {
                    temp.add(e * 2 - 1);
                }
            }
            if (temp.isEmpty()) break;
            ans = temp;
        }
        return ans;
    }

    public static ArrayList<Integer> beautifulArrayListUsingDivideAndConquer(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideAndConquer(1, 1, res, n);
        return res;
    }

    private static void divideAndConquer(int start, int inc, ArrayList<Integer> res, int n) {
        if (start > n) {
            return;
        }
        res.add(start);
        divideAndConquer(start + inc, 2 * inc, res, n);
        divideAndConquer(start, 2 * inc, res, n);
    }
}
