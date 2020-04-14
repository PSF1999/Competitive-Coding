class Solution {
    static int depth(TreeNode root) {
        if(root == null)
            return 0;
        else
            return Math.max(depth(root.left),depth(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int lDepth = depth(root.left);
        int rDepth = depth(root.right);
        int lDia = diameterOfBinaryTree(root.left);
        int rDia = diameterOfBinaryTree(root.right);
        return Math.max(lDepth+rDepth,Math.max(lDia,rDia));
        
    }
}
