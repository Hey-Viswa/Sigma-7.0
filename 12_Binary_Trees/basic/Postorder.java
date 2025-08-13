import org.w3c.dom.Node;

public class Postorder {
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree();
        tree.postorder(root);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");

    }
}
