import Basic.reverseaDLL;

public class DeleteLeafNodesWithValuesAsX {
    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return (newNode);
    }

    static Node deleteLeaves(Node root, int x){
        if (root == null) {
            return null;
        }
        root.left = deleteLeaves(root.left, x );
        root.right = deleteLeaves(root.right, x);

        if (root.data == x && root.left == null && root.right == null) {
            return null ;
        } 
        return root;
    }
    static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        // Create a sample binary tree
            Node root = newNode(10);
            root.left = newNode(3);
            root.right = newNode(10);
            root.left.left = newNode(3);
            root.left.right = newNode(1);
            root.right.right = newNode(3);
            root.right.right.left = newNode(3);
            root.right.right.right = newNode(3);

            System.out.println("Original tree (inorder):");
            inorder(root);

            int x = 3;
            System.out.println("\nDeleting leaf nodes with value: " + x);
            root = deleteLeaves(root, x);

            System.out.println("\nTree after deletion (inorder):");
            inorder(root);
    }
}
