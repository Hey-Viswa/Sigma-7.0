class SubArrays {
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 9};
        printSubarray(number);

    }
    public static void printSubarray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.printf(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}