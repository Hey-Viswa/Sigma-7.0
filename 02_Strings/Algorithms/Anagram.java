package Strings.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ANAGRAM CHECK - String Algorithm
 * 
 * Problem: Check if two strings are anagrams (contain same characters with same
 * frequency)
 * 
 * Companies: Amazon, Microsoft, Google, Facebook, Adobe, Apple
 * Difficulty: Easy-Medium
 * Topics: String manipulation, Sorting, Hash Map, Character frequency
 * 
 * Time Complexity: O(n log n) - sorting approach, O(n) - hash map approach
 * Space Complexity: O(n) - for character arrays or hash map
 * 
 * Examples: "listen" and "silent", "anagram" and "nagaram"
 */
public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Anagram Checker ===");
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Test different approaches
        boolean result1 = areAnagramsSorting(str1, str2);
        boolean result2 = areAnagramsHashMap(str1, str2);
        boolean result3 = areAnagramsArray(str1, str2);

        System.out.println("\n=== Results ===");
        System.out.println("Sorting approach: " + (result1 ? "Anagrams" : "Not anagrams"));
        System.out.println("HashMap approach: " + (result2 ? "Anagrams" : "Not anagrams"));
        System.out.println("Array approach: " + (result3 ? "Anagrams" : "Not anagrams"));

        // Test with predefined examples
        System.out.println("\n=== Test Cases ===");
        String[][] testCases = {
                { "listen", "silent" },
                { "anagram", "nagaram" },
                { "rat", "car" },
                { "hello", "bello" },
                { "The Eyes", "They See" }
        };

        for (String[] test : testCases) {
            boolean isAnagram = areAnagramsHashMap(test[0], test[1]);
            System.out.println("\"" + test[0] + "\" & \"" + test[1] + "\" -> " +
                    (isAnagram ? "Anagrams" : "Not anagrams"));
        }

        sc.close();
    }

    /**
     * Method 1: Sorting Approach
     * Time Complexity: O(n log n), Space Complexity: O(n)
     * 
     * Algorithm:
     * 1. Preprocess strings (remove spaces, convert to lowercase)
     * 2. Convert to char arrays and sort
     * 3. Compare sorted arrays
     */
    public static boolean areAnagramsSorting(String s1, String s2) {
        // Preprocess strings: remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check length first (quick rejection)
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    /**
     * Method 2: HashMap Approach (Most Efficient)
     * Time Complexity: O(n), Space Complexity: O(k) where k is unique characters
     * 
     * Algorithm:
     * 1. Count frequency of each character in first string
     * 2. Decrement frequency for each character in second string
     * 3. If all frequencies are zero, strings are anagrams
     */
    public static boolean areAnagramsHashMap(String s1, String s2) {
        // Preprocess strings
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in first string
        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement count for characters in second string
        for (char c : s2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // Character not in first string
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        // Check if all counts are zero
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Method 3: Array Approach (for ASCII characters only)
     * Time Complexity: O(n), Space Complexity: O(1) - fixed size array
     * 
     * Uses array of size 26 for lowercase letters
     */
    public static boolean areAnagramsArray(String s1, String s2) {
        // Preprocess strings
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        // Array to count characters (a-z)
        int[] charCount = new int[26];

        // Count characters
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Legacy method for compatibility
     */
    public static boolean areAnagrams(String s1, String s2) {
        return areAnagramsHashMap(s1, s2);
    }
}
