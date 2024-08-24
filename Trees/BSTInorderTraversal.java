package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BSTInorderTraversal {

    public void inorderTraversal(TreeNode root, List<Integer> inorderList) {
        if(root != null){
            inorderTraversal(root.left, inorderList);
            inorderList.add(root.val);
            inorderTraversal(root.right, inorderList);
        }

    }

    public void inorderTraversalIterative(TreeNode root, List<Integer> inorderList){
        TreeNode temp = root;
        Stack<TreeNode> store = new Stack<>();
        while(true){
            if(temp == null){
                temp = store.pop();
                inorderList.add(temp.val);
                temp = temp.right;
            }
            else {
                store.push(temp);
                temp = temp.left;
            }
            if(store.empty())
                return;
        }
    }
}
