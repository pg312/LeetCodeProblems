package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestPalindromeSubString {

    public String longestPalindrome(String s) {

        StringBuffer longestSubString = new StringBuffer();
        HashMap<Character, List<Integer>> charIndices = getCharactersIndices(s);

            for(Character c: charIndices.keySet()){
                List<Integer> indices = charIndices.get(c);
                for(int firstIndex = 0; firstIndex < indices.size(); firstIndex++){{
                    for(int secondIndex = firstIndex; secondIndex < indices.size(); secondIndex++){
                        String subString =  indices.get(secondIndex) == s.length() - 1? s.substring(indices.get(firstIndex)) : s.substring(indices.get(firstIndex),indices.get(secondIndex) +1);
                        if(isPalindrome(subString) && ( longestSubString.length() < subString.length())){
                            longestSubString = new StringBuffer(subString);
                        }
                    }

                }

            }
        }

        return longestSubString.toString();
    }

    private HashMap<Character, List<Integer>> getCharactersIndices(String s) {
        HashMap<Character, List<Integer>> charIndices = new HashMap<Character, List<Integer>>();
        for(int i = 0; i< s.length();i++){
            List<Integer> indices = charIndices.get(s.charAt(i)) == null ? new ArrayList<>(): charIndices.get(s.charAt(i));
            indices.add(i);
            charIndices.put(s.charAt(i),indices);
        }
        return charIndices;
    }

    private boolean isPalindrome(String s){
        for(int i = 0, j= s.length()-1; i<=j;i++,j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
//
//    The approach I have taken is
//
//    Finding the indices of all the characters present in the given string and created a Hashmap with character and list of it's indices
//        Traversing through hashmap of characters and checking for palindrome between two indices with all the combinations. Eg: if we find n indices then checking for substring n! times
//        If substring is a palindrome then if it is the firstone then directly assigning it to longestPalindromeString which will be returned
//        Whenever second palindrome is found, checking if it's length is greater than existing palindrome then only assigning it to longest palindrome.
//        Returning the longestPalindrome string.
//        If No string is found then it returns empty string.
