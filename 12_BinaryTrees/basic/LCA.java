import java.util.ArrayList;

public class LCA {
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        Node result = lca(root, n1, n2);
        System.out.println("LCA: " + result.data);
    }
    
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);
        
        // Find last common ancestor 
        int i = 0;
        for (i = 0; i < Math.min(path1.size(), path2.size()); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        return path1.get(i - 1);
    }

    public static Node lca2(Node root, int n1, int n2){
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.left, n1, n2);

        //leftlca = val rightlca = null
        if (rightLca == null) {
            return rightLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;

    }
    
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        
        path.add(root);
        
        if (root.data == n) {
            return true;
        }
        
        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }
        
        path.remove(path.size() - 1);
        return false;
    }
}
