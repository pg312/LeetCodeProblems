package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if(root == null)
            return true;
        return isSymmetricTreeRecu(root.left, root.right);

    }

    private boolean isSymmetricTreeRecu(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        else{
            if(left != null && right != null && left.val == right.val && isSymmetricTreeRecu(left.left, right.right)){
                return isSymmetricTreeRecu(left.right, right.left);
            }
            return false;
        }
    }

}
