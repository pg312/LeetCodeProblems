import java.util.HashMap;

public class Pangram {
    public static String pangrams(String s) {
        HashMap<Character, Integer> letters = new HashMap<>();
        s = s.toLowerCase();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                letters.put(s.charAt(i), 0);
        }
        return letters.size() == 26 ? "pangram" : "not pangram";
    }
}