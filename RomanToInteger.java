import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {

        int convertedNum = 0;
        for(int i = 0; i < s.length(); i++){
            if(i+1 != s.length() &&
                    ((s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) ||
                    (s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) ||
                    (s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')))){
                convertedNum += getCorrespondingValue(s.substring(i, i+2));
                i++;
            }
            else{
                convertedNum += getCorrespondingValue(String.valueOf(s.charAt(i)));

            }
        }

        return convertedNum;

    }

    private int getCorrespondingValue(String s){
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);

        hashMap.put("IV",4);
        hashMap.put("IX",9);
        hashMap.put("XL",40);
        hashMap.put("XC",90);
        hashMap.put("CD",400);
        hashMap.put("CM",900);

        return hashMap.get(s);
    }
}
