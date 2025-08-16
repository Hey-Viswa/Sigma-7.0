public class BSTValidate {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isValidBST(Node root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return isValidBST(node.left, min, node.data) &&
                isValidBST(node.right, node.data, max);
    }

    // Alternative approach using inorder traversal
    private static Integer prev = null;

    public static boolean isValidBSTInorder(Node root) {
        prev = null;
        return inorder(root);
    }

    private static boolean inorder(Node node) {
        if (node == null) {
            return true;
        }

        if (!inorder(node.left)) {
            return false;
        }

        if (prev != null && node.data <= prev) {
            return false;
        }
        prev = node.data;

        return inorder(node.right);
    }

    public static void main(String[] args) {
        // Test case 1: Valid BST
        Node root1 = new Node(8);
        root1.left = new Node(5);
        root1.right = new Node(11);
        root1.left.left = new Node(3);
        root1.left.right = new Node(6);
        root1.right.right = new Node(20);

        System.out.println("Test 1 - Valid BST: " + isValidBST(root1));
        System.out.println("Test 1 - Valid BST (Inorder): " + isValidBSTInorder(root1));

        // Test case 2: Invalid BST
        Node root2 = new Node(5);
        root2.left = new Node(1);
        root2.right = new Node(4);
        root2.right.left = new Node(3);
        root2.right.right = new Node(6);

        System.out.println("Test 2 - Invalid BST: " + isValidBST(root2));
        System.out.println("Test 2 - Invalid BST (Inorder): " + isValidBSTInorder(root2));
    }
}
