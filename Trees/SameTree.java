package Trees;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

       if((p != null && q != null && p.val == q.val) ){
            if(isSameTree(p.left, q.left)){
                return isSameTree(p.right,q.right);
            }
            else
                return false;
       }
       else if(p == null && q == null)
           return true;
       else return false;
    }
}
