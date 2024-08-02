import java.time.chrono.MinguoDate;

public class EqualSubstring {
    int equalSubstring(String s, String t, int maxCost) {

        if(s.length() != t.length())
            return 0;
        int [] difference = new int[s.length()];
        int totalCost = 0, index;
        for( index = 0; index < s.length() ; index++){
            difference[index] = Math.abs(s.charAt(index) - t.charAt(index));
        }
        for(index = 0; index < difference.length; ){
            if( totalCost == maxCost)
                return index;
            else if(totalCost < maxCost){
                totalCost += difference[index++];
            }
            else
                return index-1;
        }
        return 0;
    }
}
