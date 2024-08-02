import java.util.Stack;

public class ValidParanthesis {

    public boolean isValid(String s) {

        Stack<Character>  stack = new Stack<>();

        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == '(' || s.charAt(index) == '{' || s.charAt(index) == '[')
                stack.push(s.charAt(index));
            else if(!stack.empty() && ((s.charAt(index) == ')' && stack.peek() == '(') ||
                    (s.charAt(index) == '}' && stack.peek() == '{') ||
                    (s.charAt(index) == ']' && stack.peek() == '[')))
                stack.pop();
            else
                return false;
        }
        return stack.empty();
    }
}
