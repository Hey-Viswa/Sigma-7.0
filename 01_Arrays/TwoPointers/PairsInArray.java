package arrays.two_pointers;
public class PairsInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int p = pair(arr);
        System.out.println(p);
    }

    public static int pair(int[] no) {
        for (int i = 0; i < no.length; i++) {
            int current = no[i];
            for (int j = 0; j < no.length; j++) {
                System.out.print("(" + current + "," + no[j] + ")");
            }
            System.out.println();
        }
        return 0;
    }
}
