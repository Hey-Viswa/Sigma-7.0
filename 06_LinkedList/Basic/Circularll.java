package Basic;
public class Circularll {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Delete a node with given value
    public void delete(int key) {
        if (head == null) return;

        Node curr = head, prev = null;

        // If head needs to be deleted
        if (head.data == key) {
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                if (curr == tail) {
                    tail = prev;
                }
                break;
            }
        } while (curr != head);
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
