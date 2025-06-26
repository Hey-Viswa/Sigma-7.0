public class LargestNo {
    public static void main(String[] args) {
        int nos[] = {1, 2, 6, 3, 5};
        int res = getLargest(nos);
        System.out.println(res);
    }

    public static int getLargest(int[] nos) {
        int largest = Integer.MIN_VALUE; // -  infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nos.length; i++) {
            if (largest < nos[i]) {
                largest = nos[i];
            }
            if (smallest > nos[i]){
                smallest = nos[i];
            }
        }
        System.out.println("smallesty value is: " + smallest);
        return largest;
    }
}
