package arrays_questions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInAnArray {
    public static void main(String[] args) {
        DuplicateElementInAnArray dea = new DuplicateElementInAnArray();

        int[] num1 = {1,2,3,4};
        System.out.println("Output"+ dea.containsDuplicate(num1));
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();
        for(int num : nums){
            if(!seenNumbers.add(num)){
                return true;
            }
        }
        return false;
    }
}
