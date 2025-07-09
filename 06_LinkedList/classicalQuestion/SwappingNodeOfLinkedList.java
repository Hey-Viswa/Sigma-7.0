package classicalQuestion;

public class SwappingNodeOfLinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {
        Node Head;

        // Insert a new node at the end
        public void append(int new_data) {
            Node new_node = new Node(new_data);
            if (Head == null) {
                Head = new_node;
                return;
            }
            Node last = Head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        public void swapNodes(int x, int y) {
            if (x == y) {
                return;
            }
            Node prevX = null, currX = Head;
            while (currX != null && currX.data != x) {
                prevX = currX;
                currX = currX.next;
            }
            Node prevY = null, currY = Head;
            while (currY != null && currY.data != y) {
                prevY = currY;
                currY = currY.next;
            }
            if (currX == null || currY == null) {
                return;
            }
            if (prevX != null) {
                prevX.next = currY;
            } else {
                Head = currY;
            }
            if (prevY != null) {
                prevY.next = currX;
            } else {
                Head = currX;
            }
            Node temp = currX.next;
            currX.next = currY.next;
            currY.next = temp;
        }

        public void printList() {
            Node tNode = Head;
            while (tNode != null) {
                System.out.print(tNode.data + " ");
                tNode = tNode.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            SwappingNodeOfLinkedList outer = new SwappingNodeOfLinkedList();
            Solution list = outer.new Solution();

            list.append(10);
            list.append(15);
            list.append(12);
            list.append(13);
            list.append(20);
            list.append(14);

            System.out.println("Linked list before swapping:");
            list.printList();

            list.swapNodes(12, 20);

            System.out.println("Linked list after swapping 12 and 20:");
            list.printList();
        }
    }
}
