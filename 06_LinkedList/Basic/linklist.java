package LinkedList;

/**
 * LinkedList Implementation with all basic operations
 * 
 * Common Companies: Google, Amazon, Microsoft, Facebook, Adobe, Flipkart
 * Topics Covered:
 * - Basic LinkedList operations (Add, Remove, Search)
 * - Time Complexity: O(1) for add/remove at head, O(n) for tail operations
 * - Space Complexity: O(1) for all operations
 */
public class linklist {
    /**
     * Node class to represent each element in the LinkedList
     * Contains data and reference to next node
     */
    public static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList properties
    public static Node head; // Points to the first node
    public static Node tail; // Points to the last node
    public static int size; // Keeps track of number of nodes

    /**
     * Add element at the beginning of LinkedList
     * Time Complexity: O(1)
     * Companies: Amazon, Google, Microsoft
     */
    /**
     * Add element at the beginning of LinkedList
     * Time Complexity: O(1)
     * Companies: Amazon, Google, Microsoft
     */
    public void addFirst(int data) {
        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;

        // If list is empty, both head and tail point to new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: Link new node to current head
        newNode.next = head;

        // Step 3: Update head to point to new node
        head = newNode;
    }

    /**
     * Add element at the end of LinkedList
     * Time Complexity: O(1) - because we maintain tail pointer
     * Companies: Amazon, Google, Flipkart
     */
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        // If list is empty, both head and tail point to new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link current tail to new node and update tail
        tail.next = newNode;
        tail = newNode;
    }

    /**
     * Print the entire LinkedList
     * Time Complexity: O(n)
     * Used for debugging and visualization
     */
    public void printLinklist() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /**
     * Add element at specific index
     * Time Complexity: O(n) - need to traverse to index
     * Companies: Amazon, Microsoft, Adobe
     */
    public void addInMiddle(int index, int data) {
        // Special case: adding at beginning
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        // Traverse to position index-1
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // Insert new node: temp -> newNode -> temp.next
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /**
     * Remove last element from LinkedList
     * Time Complexity: O(n) - need to find second last node
     * Companies: Google, Amazon, Flipkart
     */
    public int removeLast() {
        // Case 1: Empty list
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        // Case 2: Single element
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Case 3: Multiple elements - find second last node
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // Store value to return
        prev.next = null; // Remove connection to last node
        tail = prev; // Update tail
        size--;
        return val;
    }

    /**
     * Remove first element from LinkedList
     * Time Complexity: O(1)
     * Companies: Google, Amazon, Microsoft, Facebook
     */
    public int removeFirst() {
        // Case 1: Empty list
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        // Case 2: Single element
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Case 3: Multiple elements
        int val = head.data;
        head = head.next; // Move head to next node
        size--;
        return val;
    }

    /**
     * Search for a key in LinkedList using iteration
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Companies: Amazon, Google, Microsoft, Adobe
     * 
     * @param key - value to search for
     * @return index of key if found, -1 if not found
     */
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i; // Return index where key is found
            }
            temp = temp.next;
            i++;
        }

        // Key not found
        return -1;
    }

    public int helper(Node head, int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        recSearch(helper(head, key));
    }

    /**
     * Test all LinkedList operations
     * Demonstrates: Add operations, Remove operations, Search operation
     */
    public static void main(String[] args) {
        linklist ll = new linklist();

        // Test addFirst
        ll.addFirst(1);
        ll.printLinklist();

        ll.addFirst(2);
        ll.printLinklist();

        // Test addLast
        ll.addLast(3);
        ll.printLinklist();

        ll.addLast(4);

        // Test addInMiddle
        ll.addInMiddle(2, 9);
        ll.printLinklist();

        System.out.println("Size: " + size);

        // Test removeFirst
        ll.removeFirst();
        ll.printLinklist();

        // Test removeLast
        ll.removeLast();
        ll.printLinklist();
    }
}
