public class DiameterOfTree {
    public static void main(String[] args) {
        
    }
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiameter= diameter(root.right); 
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiameter, rightDiameter));
    }
}
