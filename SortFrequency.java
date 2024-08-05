import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortFrequency {

    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> results = new HashMap<>();

        for(int i: nums){
            results.put(i, results.getOrDefault(i,0)+1);
        }
        List<Integer> keys =  results.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for(Integer key: keys){
            for(int index = 0; index < results.get(key); index++){
                result.add(key);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
