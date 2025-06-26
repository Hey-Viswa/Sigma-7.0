package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ARRAYLIST BASICS - Dynamic Array Implementation
 * 
 * Problem: Demonstrate ArrayList operations and usage
 * 
 * Companies: All companies use ArrayList in interviews
 * Difficulty: Easy
 * Topics: Collections Framework, Dynamic Arrays, Generics
 * 
 * Time Complexity:
 * - Add: O(1) amortized, O(n) worst case (when resizing)
 * - Get/Set: O(1)
 * - Remove: O(n) (shifting elements)
 * - Search: O(n)
 * 
 * Space Complexity: O(n) where n is number of elements
 */
public class Example {

    public static void main(String[] args) {
        // Creating ArrayLists of different types
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Boolean> flags = new ArrayList<>();

        System.out.println("=== ArrayList Basic Operations ===");

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 15); // Insert at index 1

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        flags.add(true);
        flags.add(false);
        flags.add(true);

        // Display initial state
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);
        System.out.println("Flags: " + flags);

        // Accessing elements
        System.out.println("\n=== Accessing Elements ===");
        System.out.println("First number: " + numbers.get(0));
        System.out.println("Size of numbers: " + numbers.size());

        // Modifying elements
        numbers.set(0, 5); // Change first element to 5
        System.out.println("After modifying first element: " + numbers);

        // Searching
        System.out.println("\n=== Searching ===");
        System.out.println("Contains 20? " + numbers.contains(20));
        System.out.println("Index of 30: " + numbers.indexOf(30));

        // Removing elements
        System.out.println("\n=== Removing Elements ===");
        numbers.remove(1); // Remove element at index 1
        System.out.println("After removing index 1: " + numbers);

        numbers.remove(Integer.valueOf(30)); // Remove by value
        System.out.println("After removing 30: " + numbers);

        // Sorting
        System.out.println("\n=== Sorting ===");
        ArrayList<Integer> unsorted = new ArrayList<>();
        unsorted.add(50);
        unsorted.add(10);
        unsorted.add(30);
        unsorted.add(20);

        System.out.println("Before sorting: " + unsorted);
        Collections.sort(unsorted);
        System.out.println("After sorting: " + unsorted);

        // Reverse sorting
        Collections.sort(unsorted, Collections.reverseOrder());
        System.out.println("Reverse sorted: " + unsorted);

        // Iterating through ArrayList
        System.out.println("\n=== Iteration Methods ===");

        // Method 1: Enhanced for loop (recommended)
        System.out.print("Enhanced for loop: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Method 2: Traditional for loop
        System.out.print("Traditional for loop: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        // Utility operations
        System.out.println("\n=== Utility Operations ===");
        System.out.println("Is numbers list empty? " + numbers.isEmpty());

        ArrayList<Integer> copy = new ArrayList<>(numbers);
        System.out.println("Copied list: " + copy);

        numbers.clear();
        System.out.println("After clearing: " + numbers);
        System.out.println("Is now empty? " + numbers.isEmpty());
    }
}
