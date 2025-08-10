import StackUsingLinkedList.Node;

public class KthLevel {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(5);

        int k = 3;
        KthLevel(root, 1, k);
    }
    public static void KthLevel(Node root, int level, int k){
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.println(root.data + " ");
        }
        KthLevel(root.left, level+1, k);
    }
}
