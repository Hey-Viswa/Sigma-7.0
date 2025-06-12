public class KadaneAlgorithm {
    public static void main(String[] args) {
        int numbers[] = {1, -3, 4, -1, -2, 1, 5};
        kadane(numbers);
    }

    public static void kadane(int[] numbers) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int number : numbers) {
            cs = cs + number;
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Out max sub array sum is: " + ms);
    } 
}


class Solution {
  public int maxSubArray(int[] numbers) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for (int number : numbers) {
      cs = cs + number; 
      if ( cs > ms){
        ms = cs;
      }
      if (cs < 0) {
        cs = 0;
      }
    }
   return ms;
  }
}
