package Trees;

public class BSTCreation {

    public TreeNode createBST(int [] array){

        TreeNode root = null;

        for(int element: array){
           root =  add(root,element);
        }
        return root;

    }

    private TreeNode add(TreeNode root, int element) {
        if(root == null)
            return new TreeNode(element,null, null);
        else if(root.val > element){
                root.left = add(root.left, element);
                return root;
        }
        else{
                root.right = add(root.right,element);
                return root;
        }
    }
}
