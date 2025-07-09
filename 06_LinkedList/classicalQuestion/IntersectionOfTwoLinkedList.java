package classicalQuestion;

// in a system there are two singly linkedlist. By some programming error, the end node of one of the linkedlists got linked to the second list, forming an inverted Y-shapedlist.Write a program to get the point where two linked lists merge we have to find the intersection part in this system.

public class IntersectionOfTwoLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedList ill = new IntersectionOfTwoLinkedList();
        
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        
        Node newNode = new Node(6);
        head2.next = newNode;
    }
}
