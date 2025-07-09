// Question: Stack using Linked List (Asked in OYO and Amazon)

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    static class Stack {
        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) { // Fixed constructor name (should be Node, not node)
            this.data = data;
            this.next = null;
        }
    }
}
