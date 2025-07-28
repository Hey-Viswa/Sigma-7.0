import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        // Creating a sample palindrome linked list: 1 -> 2 -> 3 -> 2 -> 1
        Node head = new Node(1);
        head.ptr = new Node(2);
        head.ptr.ptr = new Node(3);
        head.ptr.ptr.ptr = new Node(2);
        head.ptr.ptr.ptr.ptr = new Node(1);

        System.out.println(isPalindrome(head)); // Output: true
    }

    static boolean isPalindrome(Node head) {
        Node slow = head;
        Stack<Integer> stack = new Stack<>();

        // Push all elements onto the stack
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        // Compare elements while popping from the stack
        Node current = head;
        while (current != null) {
            int top = stack.pop();
            if (current.data != top) {
                return false;
            }
            current = current.ptr;
        }
        return true;
    }

    static class Node {
        int data;
        Node ptr;
        Node(int d) {
            data = d;
            ptr = null;
        }
    }
}
