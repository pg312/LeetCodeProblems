import java.util.Stack;

public class LongestValidParanthesis {

    public int longestValidParentheses(String s) {
        int longestValidParanthesisLength = 0, currentParanthesisLength = 0;
        Stack<Character> characterStack = new Stack<>();
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == '('){
                characterStack.push(s.charAt(index));
            }else if(!characterStack.isEmpty() && s.charAt(index) == ')' && characterStack.peek() == '('){
                    characterStack.pop();
                    currentParanthesisLength += 2;
                    if(!characterStack.isEmpty() && (index+1 == s.length() || s.charAt(index+1) != ')') )
                        currentParanthesisLength -= longestValidParanthesisLength;
                    longestValidParanthesisLength = Math.max(longestValidParanthesisLength, currentParanthesisLength);
            }
        }
        return longestValidParanthesisLength;
    }
}
