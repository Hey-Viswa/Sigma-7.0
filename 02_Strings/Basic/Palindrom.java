package Strings;

/**
 * PALINDROME CHECK - String Algorithm
 * 
 * Problem: Check if a string reads the same forwards and backwards
 * 
 * Companies: Amazon, Microsoft, Google, Facebook, Adobe, Wipro, TCS
 * Difficulty: Easy
 * Topics: Strings, Two Pointers
 * 
 * Time Complexity: O(n/2) = O(n) - check half the string
 * Space Complexity: O(1) - no extra space used
 * 
 * Examples: "racecar", "madam", "level" are palindromes
 */
public class Palindrom {

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = { "racecar", "hello", "madam", "level", "world", "a" };

        System.out.println("=== Palindrome Check Results ===");
        for (String str : testStrings) {
            boolean result = isPalindrome(str);
            System.out.println("\"" + str + "\" -> " + (result ? "Palindrome" : "Not Palindrome"));
        }
    }

    /**
     * Check if a string is palindrome using two-pointer approach
     * 
     * Algorithm:
     * - Compare characters from start and end moving towards center
     * - If any pair doesn't match, it's not a palindrome
     * - Only need to check first half of string
     * 
     * @param str - input string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        int n = str.length();

        // Compare characters from both ends moving towards center
        for (int i = 0; i < n / 2; i++) {
            // If characters don't match, not a palindrome
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true; // All characters matched
    }

    /**
     * Alternative recursive implementation
     * More intuitive but uses extra space for recursion stack
     * 
     * @param str   - input string
     * @param start - starting index
     * @param end   - ending index
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base case: single character or empty string
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursively check remaining substring
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}
