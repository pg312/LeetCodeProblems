package Trees;

import java.util.Stack;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
       Stack<TreeNode> treeNodeStack = new Stack<>();
       Stack<Integer> sums = new Stack<>();
       int temp = 0;
       while(true ){
           if(root != null){
               temp += root.val;
               sums.push(temp);
               if(temp == targetSum && root.left == null && root.right == null)
                   return true;
               treeNodeStack.push(root.right);
               root =  root.left;
           }
           else if(!treeNodeStack.isEmpty()){
               root = treeNodeStack.pop();
               temp = sums.pop();
           }

           else
               return false;

       }
    }
}
