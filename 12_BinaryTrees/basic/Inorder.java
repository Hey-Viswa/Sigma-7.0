import org.w3c.dom.Node;

import Basic.reverseaDLL;

public class Inorder {
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree();

        tree.inorder(root);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
}
