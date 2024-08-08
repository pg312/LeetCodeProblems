public class SearchInsertPositions {

    public int searchInsert(int[] nums, int target) {
        return recursiveSearch(nums,0,nums.length,target);
    }
    public int recursiveSearch(int[] nums, int left, int right, int target){
        int middleIndex = (left+right)/2;
        if(nums[middleIndex] == target)
            return middleIndex;
        else if(right - left == 1)
            return target < nums[left] ? left : right;
        else if(nums[middleIndex] > target)
            return recursiveSearch(nums,left,middleIndex,target);
        else{
            return recursiveSearch(nums,middleIndex, right, target);
        }
    }
}
