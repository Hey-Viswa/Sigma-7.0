import StackUsingLinkedList.Node;

public class Preorder {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree();
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
