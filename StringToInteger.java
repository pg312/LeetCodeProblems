public class StringToInteger {

    public int myAtoi(String s) {
        int result = 0;
        s = s.trim();
        boolean isNegative = false;
        if(s.charAt(0) == '-'){
            isNegative = true;
            s = s.substring(1);
        }
        for(int index  = 0; index < s.length(); index++){

            if(s.charAt(index) >= '0' && s.charAt(index) <= '9'){
                result = result * 10 + s.charAt(index) - '0';
                if(result > Integer.MAX_VALUE)
                    result = Integer.MAX_VALUE;
                else if(isNegative && -result < Integer.MIN_VALUE)
                    result = Integer.MIN_VALUE;
            }
            else
                break;
        }
        if(isNegative){
            result = -result;
        }
        return result;

    }
}
