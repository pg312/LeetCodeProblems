package Trees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        int count = 0;
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        while(root!= null){
            count++;
            if(root.left != null && root.right != null){
                treeNodeQueue.add(root.left);
                treeNodeQueue.add(root.right);
            }
            else if(root.left != null){
                treeNodeQueue.add(root.left);
                break;
            }
            else {
                break;
            }
            root = treeNodeQueue.poll();
        }
        return count+treeNodeQueue.size();
    }
}
