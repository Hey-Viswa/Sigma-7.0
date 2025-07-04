package Basic.Important;
import Basic.LinkedList;

import Basic.LinkedList.Node;
// find mid node
// 2n half reverse
// check if 1st half == 2nd half

/*
 * can be done using slow-fast technique
 * slow = head // + 1
 * fast = head // + 2
 * even case
 * fast != null
 */

public class LLIsPalindrome {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLinklist();
        System.out.println(checkPalindrom(ll.head));
    }
    
    // slow fast approach
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // + 1
            fast = fast.next.next; // + 2
        }
        return slow; // slow is my mid Node
    }

    public static boolean checkPalindrom(Node head){
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);                     
        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }
        // step 3 - compare left == right
        Node right = prev; // right half head
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

}
