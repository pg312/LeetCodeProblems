package Trees;

import apple.laf.JRSUIUtils;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class BSTInorderTraversal {

    public class TreeNode {
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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inOrderList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(true){
            while(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            if(stack.empty())
                break;
            temp = stack.pop();
            inOrderList.add(temp.val);
            temp = temp.right;
        }
        return inOrderList;
    }

    private void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }

    public TreeNode createTree(int [] input){
        TreeNode root = new TreeNode(input[0],null,null);
        TreeNode temp = root;
        Queue<TreeNode> treeNodes = new LinkedList<>();
        for(int index = 1;index< input.length ; index++){
            if(temp.left == null){
                temp.left = new TreeNode(input[index],null,null);
                treeNodes.add(temp.left);
            }
            else if(temp.right == null){
                temp.right = new TreeNode(input[index],null,null);
                treeNodes.add(temp.right);
                temp = treeNodes.poll();
            }
        }
        return root;
    }
}
