public class MinDistanceBetweenNodes {
    static class Node {
        int data; Node left; Node right;
        Node(int d){ data=d; }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 6;
        System.out.println(mindist(root, n1, n2));
    }

    public static int mindist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcadist(lca, n1);
        int dist2 = lcadist(lca, n2);
        return dist1 + dist2;
    }

    public static int lcadist(Node root, int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;
        int left = lcadist(root.left, n);
        int right = lcadist(root.right, n);
        if (left == -1 && right == -1) return -1;
        if (left == -1) return right + 1;
        return left + 1;
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) return root;
        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);
        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
