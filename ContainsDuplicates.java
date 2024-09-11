import java.util.Arrays;
import java.util.stream.Stream;

public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        long countOfUniqueElements = Arrays.stream(nums).distinct().count();
        return countOfUniqueElements < nums.length;

    }
}
