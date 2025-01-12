import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push('(');
            else {
                if(stack.size() != 0 && stack.peek() == '(') stack.pop();
                else stack.push(')');
            }
        }
        
        return stack.size() == 0;
    }
}