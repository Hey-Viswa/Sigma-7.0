package classicalQuestion;

public class OddEvenLinkedList {
    static class Solution {
        Node head;
        class Node {
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
        }
        void segregateEvenOdd(){
            Node end = head;
            Node prev = null;
            Node curr = head;

            while (end.next != null) {
                end = end.next;
            }
            Node new_End = end;
            while (curr.data %2 !=0 && curr != end) {
                new_End.next = curr;
                curr = curr.next;
                new_End.next.next = null;
                new_End = new_End.next;
            }
            if (curr.data % 2 == 0) {
                head = curr;
                while (curr != end) {
                    if (curr.data % 2 == 0) {
                        prev = curr;
                        curr = curr.next;
                    }
                    else {
                        prev.next = curr.next;
                        curr.next = null;
                        new_End.next = curr;
                        new_End = curr;
                        curr = prev.next;
                    }
                }
            }
            else prev = curr;
            if (new_End != end && end.data %2 != 0) {
                prev.next = end.next;
                end.next = null;
                new_End.next = end;
            }
        }
        void push (int new_data){
            Node new_Node = new Node(new_data);
            new_Node.next = head;
            head = new_Node;
        }
        void printList(){
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution llist = new Solution();
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(4);
        llist.push(2);
        llist.push(0);
        System.out.println(" Linked List ");
        llist.printList();

        llist.segregateEvenOdd();
        System.out.println("Updated linked list");
        llist.printList();
    }
}