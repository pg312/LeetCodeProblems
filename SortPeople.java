import java.util.Comparator;
import java.util.HashMap;

public class Solution {

        public String[] sortPeople(String[] names, int[] heights) {
            HashMap<Integer, String> temp = new HashMap<>();

            for(int index = 0; index < heights.length; index++){
                temp.put(heights[index], names[index]);

            }
           String[] results =   temp.keySet().stream().sorted(Comparator.reverseOrder()).map(temp::get).toArray(String[]::new );

            return results;
        }
}
