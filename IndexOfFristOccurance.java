public class IndexOfFristOccurance {
    public int strStr(String haystack, String needle) {
        int length = needle.length();
        for(int traverseIndex = 0; traverseIndex <= haystack.length() - length; traverseIndex++){
            if(haystack.substring(traverseIndex, traverseIndex+length).equals(needle))
                return traverseIndex;
        }
        return -1;
    }
}
