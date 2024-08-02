import java.util.Stack;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Stack<Character> characterStack = new Stack<>();
        for(int index  = 0; index < s.length();index++){
            if(characterStack.empty() || characterStack.search(s.charAt(index))==-1)
                characterStack.push(s.charAt(index));
            else if(characterStack.search(s.charAt(index)) != -1){
                maxLength = Math.max(maxLength, characterStack.size());
                characterStack.clear();
                characterStack.push(s.charAt(index));
            }
        }
        return maxLength;
    }
}
