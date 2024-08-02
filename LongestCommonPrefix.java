import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for(int index = 0; index <= strs[0].length(); index++){
            String subString = strs[0].substring(0,index);
            if(Arrays.stream(strs).allMatch(s -> s.startsWith(subString)))
                prefix = subString;
            else
                break;
        }
        return  prefix;
    }
}
