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

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if (root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.left);
        int diam = Math.max(leftInfo.diam, rightInfo.diam, leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);

    }
}
