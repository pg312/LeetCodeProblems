public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int tempIndex = 0;
        for(int traverseIndex = 0; traverseIndex < nums.length; traverseIndex++){
            if(nums[traverseIndex] != val){
                nums[tempIndex++] = nums[traverseIndex];
            }
        }
        return tempIndex;
    }
}
