public class FirstAndLastPosition {

    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int low = 0, high = nums.length -1;
       while (low <= high){
           if(nums[low] == target){
               start = (low < start) || start == -1 ? low : start;
           }
           if(nums[high] == target){
               end = (high > end) || end == -1 ? high: end;
           }
            int mid = (low+high)/2;
            if(nums[mid] == target){
                start = (mid < start) || start == -1 ? mid : start;
                end = (mid > end) || end == -1 ? mid: end;
                low++;
                high--;

            }
            else if(target < nums[mid]){
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return new int[]{start,end};
    }
}
