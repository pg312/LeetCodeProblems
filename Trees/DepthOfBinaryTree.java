package Trees;

public class DepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root != null){
           int leftDepth = maxDepth(root.left);
           int rightDepth = maxDepth(root.right);
           depth = Math.max(leftDepth, rightDepth)+1;
        }
        return depth;
    }
}
