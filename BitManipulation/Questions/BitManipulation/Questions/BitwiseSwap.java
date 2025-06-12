package BitManipulation.Questions;

public class BitwiseSwap {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        // XOR-based swap logic
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
