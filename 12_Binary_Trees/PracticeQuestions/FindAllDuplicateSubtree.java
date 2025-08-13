import java.util.*;

public class FindAllDuplicateSubtree {
    
    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    private Map<String, Integer> subtreeCount;
    private List<TreeNode> result;
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        subtreeCount = new HashMap<>();
        result = new ArrayList<>();
        serialize(root);
        return result;
    }
    
    private String serialize(TreeNode node) {
        if (node == null) {
            return "null";
        }
        
        // Serialize current subtree
        String subtree = node.val + "," + serialize(node.left) + "," + serialize(node.right);
        
        // Count occurrences of this subtree structure
        subtreeCount.put(subtree, subtreeCount.getOrDefault(subtree, 0) + 1);
        
        // If we've seen this subtree exactly twice, add it to result
        if (subtreeCount.get(subtree) == 2) {
            result.add(node);
        }
        
        return subtree;
    }
    
    // Helper method to print tree (for testing)
    public void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }
    
    // Test method
    public static void main(String[] args) {
        FindAllDuplicateSubtree solution = new FindAllDuplicateSubtree();
        
        // Example tree:     1
        //                  / \
        //                 2   3
        //                /   / \
        //               4   2   4
        //                  /
        //                 4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);
        
        List<TreeNode> duplicates = solution.findDuplicateSubtrees(root);
        
        System.out.println("Duplicate subtrees found: " + duplicates.size());
        for (int i = 0; i < duplicates.size(); i++) {
            System.out.print("Subtree " + (i + 1) + ": ");
            solution.printInorder(duplicates.get(i));
            System.out.println();
        }
    }
}
