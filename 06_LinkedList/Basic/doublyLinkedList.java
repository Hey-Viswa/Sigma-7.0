package Basic;

import javax.lang.model.type.IntersectionType;

import Basic.LinkedList.Node;

public class doublyLinkedList {
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
    }

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // remove first
    public int removeFirst() {
        if (head == null) {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "<->");
        }
        System.out.println("null");
    }
}
