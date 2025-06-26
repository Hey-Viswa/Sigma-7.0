package ArrayList.ImportantQuestions.exerciseQuestions;

import java.util.ArrayList;

public class MonotonicArray {
    public static void main(String[] args) {
        // --- Test cases ---
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        System.out.println("Is [1,2,2,3] monotonic? " + monotonicArray(list1, 0)); // Expected: true

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(4);
        System.out.println("Is [6,5,4,4] monotonic? " + monotonicArray(list2, 0)); // Expected: true

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);
        System.out.println("Is [1,3,2] monotonic? " + monotonicArray(list3, 0)); // Expected: false

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1); // Single element list
        System.out.println("Is [1] monotonic? " + monotonicArray(list4, 0)); // Expected: true

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(1); // Two identical elements
        System.out.println("Is [1,1] monotonic? " + monotonicArray(list5, 0)); // Expected: true

        ArrayList<Integer> list6 = new ArrayList<>(); // Empty list
        System.out.println("Is [] monotonic? " + monotonicArray(list6, 0)); // Expected: true
    }

    public static boolean monotonicArray(ArrayList<Integer> list, int nums) { // <--- Still has 'int nums' parameter
        // Add the edge case for lists with 0 or 1 element: they are always monotonic
        if (list.size() <= 1) {
            return true;
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isIncreasing = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                isDecreasing = false;
            }

            // Optimization: If both flags become false, we can stop early
            if (!isIncreasing && !isDecreasing) {
                return false;
            }
        }
        // If at least one flag is still true, the array is monotonic
        return isIncreasing || isDecreasing;
    }
}