public class CheckIfABinaryTreeIsUnivaluedOrNot {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node newNode(int data){
        Node temp = newNode();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    static boolean isUnivalTree(Node root){
        if (root == null) {
            return ture;
        }
        if (root.left != null && root.data != root.right.data) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(1);
        root.right = newNode(1);
        root.left.left = newNode(1);
        root.left.right = newNode(1);
        
        if (isUnivalTree(root)) {
            System.out.println("The tree is univalued");
        } else {
            System.out.println("The tree is not univalued");
        }
    }
}
