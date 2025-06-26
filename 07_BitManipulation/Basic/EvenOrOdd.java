package BitManipulation;

/**
 * BIT MANIPULATION OPERATIONS - Fundamental Bit Operations
 * 
 * Problems: Even/Odd check, Get/Set/Clear bits, Update bits
 * 
 * Companies: Google, Amazon, Microsoft, Facebook, Apple, Adobe
 * Difficulty: Easy-Medium
 * Topics: Bit manipulation, Binary operations, Bitwise operators
 * 
 * Time Complexity: O(1) - all operations are constant time
 * Space Complexity: O(1) - no extra space required
 * 
 * Key Concepts:
 * - LSB (Least Significant Bit) determines odd/even
 * - Left shift (<<) for power of 2 multiplication
 * - AND (&), OR (|), XOR (^), NOT (~) operations
 */
public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("=== Bit Manipulation Operations ===");

        // Test even/odd
        int[] testNumbers = { 3, 4, 7, 10, 15, 16 };
        System.out.println("\n--- Even/Odd Check ---");
        for (int num : testNumbers) {
            oddOrEven(num);
        }

        // Test bit operations
        int number = 10; // Binary: 1010
        int position = 2;

        System.out.println("\n--- Bit Operations on " + number + " (Binary: " +
                Integer.toBinaryString(number) + ") ---");

        System.out.println("Get bit at position " + position + ": " + getIthBit(number, position));
        System.out.println("Set bit at position 0: " + setIthBit(number, 0) +
                " (Binary: " + Integer.toBinaryString(setIthBit(number, 0)) + ")");
        System.out.println("Clear bit at position 1: " + clearIthBit(number, 1) +
                " (Binary: " + Integer.toBinaryString(clearIthBit(number, 1)) + ")");
        System.out.println("Update bit at position 0 to 1: " + updateIthBit(number, 0, 1) +
                " (Binary: " + Integer.toBinaryString(updateIthBit(number, 0, 1)) + ")");
    }

    /**
     * Check if number is even or odd using bit manipulation
     * 
     * Logic: If LSB (Least Significant Bit) is 0, number is even; if 1, odd
     * Uses bitwise AND with 1 to check LSB
     * 
     * @param n - number to check
     */
    public static void oddOrEven(int n) {
        int bitMask = 1; // Binary: 0001

        if ((n & bitMask) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    /**
     * Get the bit at ith position (0-indexed from right)
     * 
     * Algorithm:
     * 1. Create bit mask: 1 << i (shifts 1 left by i positions)
     * 2. AND with number to isolate ith bit
     * 3. Return 1 if bit is set, 0 if not
     * 
     * @param n - number to check
     * @param i - bit position (0-indexed from right)
     * @return 0 or 1 depending on bit value
     */
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i; // Create mask with 1 at ith position

        if ((n & bitMask) == 0) {
            return 0; // Bit is not set
        } else {
            return 1; // Bit is set
        }
    }

    /**
     * Set the bit at ith position to 1
     * 
     * Algorithm:
     * 1. Create bit mask: 1 << i
     * 2. OR with number to set the bit
     * 
     * @param n - original number
     * @param i - bit position to set
     * @return number with ith bit set to 1
     */
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i; // Create mask with 1 at ith position
        return n | bitMask; // OR operation sets the bit
    }

    /**
     * Clear the bit at ith position (set to 0)
     * 
     * Algorithm:
     * 1. Create bit mask: ~(1 << i) (NOT of 1 shifted left)
     * 2. AND with number to clear the bit
     * 
     * @param n - original number
     * @param i - bit position to clear
     * @return number with ith bit set to 0
     */
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i); // Create mask with 0 at ith position, 1s elsewhere
        return n & bitMask; // AND operation clears the bit
    }

    /**
     * Update the bit at ith position to specified value
     * 
     * Algorithm:
     * 1. If newBit is 0, clear the bit
     * 2. If newBit is 1, set the bit
     * 
     * @param n      - original number
     * @param i      - bit position to update
     * @param newBit - new bit value (0 or 1)
     * @return number with ith bit updated
     */
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    /**
     * Alternative update method using clear + set approach
     * More explicit but slightly less efficient
     */
    public static int updateIthBitAlternative(int n, int i, int newBit) {
        // First clear the bit, then set it if needed
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
}
