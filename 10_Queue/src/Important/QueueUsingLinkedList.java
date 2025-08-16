package Important;

public class QueueUsingLinkedList {

    // Node for linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue implementation using linked list
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add (enqueue)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove (dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int frontVal = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return frontVal;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        System.out.println(q.peek()); // 10
        System.out.println(q.remove()); // 10
        System.out.println(q.peek()); // 20
    }
}
