import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int currentElement = 101;
        int tempIndex = 0;

        for(int traverseIndex = 0; traverseIndex < nums.length ; traverseIndex++){
            if(currentElement != nums[traverseIndex]){
               currentElement = nums[traverseIndex];
               nums[tempIndex] = currentElement;
               tempIndex++;
           }
        }
        return tempIndex;
    }
}
