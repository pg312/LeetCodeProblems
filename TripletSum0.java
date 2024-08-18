import java.util.*;
import java.util.stream.Collectors;

public class TripletSum0 {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        Arrays.sort(nums);
        for(int index = 0; index < nums.length -2; index++){
            for(int left = index+1, right = nums.length -1; left < right;){
                if(nums[left] + nums[right] == Math.negateExact(nums[index])){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[index]);
                    temp.add(nums[left++]);
                    temp.add(nums[right--]);
                    triplets.add(temp);
                }
                else if(nums[left] + nums[right] > Math.negateExact(nums[index]))
                    right--;
                else
                    left++;
            }
        }
        return triplets.stream().collect(Collectors.toList());

    }
}
