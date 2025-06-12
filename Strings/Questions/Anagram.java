package Strings.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

    }

    public static boolean areAnagrams(String s1, String s2) {
        // preprocess string
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // check length
        if (s1.length() != s2.length()) {
            return false;
        }
        // convet to char array and sort them
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // string builder to build ar sortedarray
        StringBuilder sb1 = new StringBuilder();
        for (char ch : arr1) {
            sb1.append(ch);
        }
        StringBuilder sb2 = new StringBuilder();
        for (char ch : arr2) {
            sb2.append(ch);
        }

        return sb1.toString().equals(sb2.toString());
    }
}
