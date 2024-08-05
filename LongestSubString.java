public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        String  longestSubstring = "";
        int maxLength = 0;
        for(int index  = 0; index < s.length(); index++){
            int charIndex = longestSubstring.indexOf(s.charAt(index));
            if(charIndex != -1){
               maxLength = Math.max(maxLength, longestSubstring.length());
                longestSubstring = longestSubstring.substring(charIndex+1);
            }
            longestSubstring += s.charAt(index);
        }
        return Math.max(maxLength, longestSubstring.length());
    }
}
