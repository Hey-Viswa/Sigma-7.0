public class MaximumPathSumInABinaryTree {
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    private int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxSum;
    }
    
    private int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        // Maximum gain from left and right subtrees (ignore negative gains)
        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);
        
        // Price of new path including current node
        int priceNewPath = node.val + leftGain + rightGain;
        
        // Update global maximum
        maxSum = Math.max(maxSum, priceNewPath);
        
        // Return maximum gain for path including current node
        return node.val + Math.max(leftGain, rightGain);
    }
    
    // Test method
    public static void main(String[] args) {
        MaximumPathSumInABinaryTree solution = new MaximumPathSumInABinaryTree();
        
        // Create test tree:      1
        //                       / \
        //                      2   3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        System.out.println("Maximum path sum: " + solution.maxPathSum(root)); // Output: 6
        
        // Create another test tree:    -10
        //                             /   \
        //                            9     20
        //                                 /  \
        //                               15    7
        TreeNode root2 = new TreeNode(-10);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);
        
        System.out.println("Maximum path sum: " + solution.maxPathSum(root2)); // Output: 42
    }
}
