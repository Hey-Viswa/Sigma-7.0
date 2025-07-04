package Basic;

import Basic.LinkedList.Node;

public class reverseaDLL {
    public static void main(String[] args) {
        reverseaDLL rdll = new reverseaDLL();
        
    }

    public void reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
