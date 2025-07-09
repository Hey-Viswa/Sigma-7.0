package classicalQuestion;

import java.util.SortedMap;

import Basic.reverseaDLL;
import Basic.LinkedList.Node;

public class MergeKSortedLists {
    public static Node sortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        }
        else if (b == null) {
            return a;
        }
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    public static Node mergeLists(Node arr[], int last) {
        int i = 0, j = last;
        while (i < j) {
            arr[i] = sortedMerge(arr[i], arr[j]);
            i++;
            j--;
            if (i >= j) {
                last = j;
            }
        }
        return arr[0];
    }
    public static void printList(Node node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int k = 3;
        Node arr[] = new Node[k];
        arr[0] = new Node(1);
        // You can add more initialization here for arr[1], arr[2], etc.
    }
}
