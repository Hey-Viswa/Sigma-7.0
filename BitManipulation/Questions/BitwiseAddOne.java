package BitManipulation.Questions;

public class BitwiseAddOne {

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Original value of x: " + x);

        // Bit manipulation to add 1
        int result = -~x;

        System.out.println("Value of x after adding 1 using bitwise NOT: " + result);
    }
}
