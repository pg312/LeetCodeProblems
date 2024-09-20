public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }

    public int binarySearch(int [] nums, int low, int high, int target){
        if(low <= high){
            int mid = (low+high)/2;
            if(target == nums[mid])
                return mid;
            if(nums[low] <= nums[mid] ){
                if(target >= nums[low] && target < nums[mid])
                     return binarySearch(nums,low,mid-1,target);
                else
                   return binarySearch(nums,mid+1,high,target);
            }
            else{
                if(target > nums[mid] && target <= nums[high])
                    return binarySearch(nums,mid+1,high,target);
                else
                    return binarySearch(nums,low, mid-1, target);
            }
        }
        return -1;
    }
}
