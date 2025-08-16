// Suggested code may be subject to a license. Learn more: ~LicenseLog:1931168074.
public class BST {

    private Node root;

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }
        // handle duplicate values if needed, for simplicity skipping here

        return node;
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        display(node.right, indent + "\t");
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean find(int val) {
        return find(root, val);
    }

    private boolean find(Node node, int val) {
        if (node == null) {
            return false;
        }
        if (val < node.val) {
            return find(node.left, val);
        } else if (val > node.val) {
            return find(node.right, val);
        } else {
            return true;
        }
    }

    // Delete a node from the BST
    public void delete(int val) {
        root = delete(root, val);
    }

    private Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            root.left = delete(root.left, val);
        } else if (val > root.val) {
            root.right = delete(root.right, val);
        } else {
            // Node to be deleted found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: get inorder successor (smallest in the right subtree)
            Node successor = findInOrderSuccessor(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }
        return root;
    }

    private Node findInOrderSuccessor(Node node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Example usage
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.display();

        System.out.println("Is 40 in the tree? " + tree.find(40));
        System.out.println("Is 90 in the tree? " + tree.find(90));


    }
}
