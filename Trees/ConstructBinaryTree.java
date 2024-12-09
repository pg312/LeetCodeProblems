import com.sun.source.tree.Tree;

import java.lang.ref.Reference;
import java.util.*;

public class ConstructBinaryTree {
    public class TreeNode {
        int val;
       TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        List<Integer> inorderList = Arrays.stream(inorder).boxed().toList();
        int preorderIndex[]= {0};
        TreeNode root =  buildTree(0, preorder.length, inorderList, preorderIndex, preorder);
        return root;
    }

    private TreeNode buildTree(int inorderLowerIndex, int inorderHigherIndex, List<Integer> inorderList, int[] preorderIndex, int[] preorder) {
        TreeNode temp = null;
        if(inorderLowerIndex < inorderHigherIndex && preorderIndex[0] < preorder.length){
            int inorderIndex = inorderList.indexOf(preorder[preorderIndex[0]]);
            temp = new TreeNode(preorder[preorderIndex[0]++],null,null);
            temp.left = buildTree(inorderLowerIndex,inorderIndex,inorderList, preorderIndex, preorder);
            temp.right = buildTree(inorderIndex+1, inorderHigherIndex,inorderList,preorderIndex,preorder);

        }
        return temp;
    }
}
