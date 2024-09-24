package Trees;

public class ConvertSortedArrayIntoBST {

    public TreeNode covert(int [] sortedArray){
        return convertRecursively(new TreeNode(), sortedArray, 0, sortedArray.length-1);
    }

    private TreeNode convertRecursively(TreeNode root, int[] sortedArray, int low, int high) {
        if(low <= high){
            int mid = (low+high)/2;
            root = new TreeNode(sortedArray[mid],null, null);
            root.left = convertRecursively(root.left,sortedArray, low,mid-1);
            root.right = convertRecursively(root.right,sortedArray, mid+1,high);
        }
        return root;
    }
}
