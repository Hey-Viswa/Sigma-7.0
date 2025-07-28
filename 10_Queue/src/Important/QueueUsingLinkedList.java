package Important;

public class QueueUsingLinkedList {
    public static void main(String[] args) {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        static class Queue {
            static Node head = nullk;
            static Node tail = null;

            Queue(int n) {
                arr = new int[n];
                size = n;
                rear = -1;
                front = -1;
            }

            public static boolean isEmpty() {
                return rear == -1 && front == -1;
            }

            // add
            public static void add(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = tail = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }

            // remove
            public static int remove() {
                if (isEmpty()) {
                    System.out.println("empty queue");
                    return -1;
                }
                int front = head.data;
                if (tail == head) {
                    tail = head = null;
                } else {
                    head = head.next;
                }
                return front;
            }

            // peek
            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Empty queue");
                    return -1;
                }
            }
        }
    }
}
