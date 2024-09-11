public class StringToInteger {

    public int myAtoi(String s) {
        int result = 0, prevResult = 0;
        s = s.trim();
        if(!s.isEmpty()){
            boolean isNegative = s.charAt(0) == '-';
            if(s.charAt(0) == '-' || s.charAt(0) == '+'){
                s = s.substring(1);
            }
            for(int index  = 0; index < s.length(); index++){

                if(s.charAt(index) >= '0' && s.charAt(index) <= '9'){
                    result = result * 10 + s.charAt(index) - '0';
                    if(isNegative && result <= Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                    else if(result/10 != prevResult){
                        return Integer.MAX_VALUE;
                    }
                    prevResult = result;
                }
                else
                    break;
            }
            result = isNegative ? -result : result;
        }
        return result;

    }
}
