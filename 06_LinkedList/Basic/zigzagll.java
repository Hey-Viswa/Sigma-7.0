package Basic;

import Basic.LinkedList.Node;

public class zigzagll {
    public static void main(String[] args) {

    }

    public void zigZag(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextLeft , nextRight;

        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;

            left = nextLeft;
            right = nextRight;
        }
    }
}
