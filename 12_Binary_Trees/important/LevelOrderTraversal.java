import java.util.LinkedList;
import java.util.Queue;

import StackUsingLinkedList.Node;

public class LevelOrderTraversal {
    // DFS
    public static void main(String[] args) {

    }

    // level order traversal
    public static void lot(Node root){
        if (root == null) {
            return ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(null);
        q.add(root);
        while (!q.isEmpty()) {
            Node currNode= q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.println(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
}
