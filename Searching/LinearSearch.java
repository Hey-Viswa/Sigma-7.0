public class LinearSearch {
    public static int linearSearch(int no[], int key) {
        for (int i = 0; i < no.length; i++) {
            if (no[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 17};
        int key = 9;
        int index = linearSearch(marks,key);
        if (index == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index");
        }
    }
}
