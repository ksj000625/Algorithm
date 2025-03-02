import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int length = number.length();
        
        for (int i = 0; i < length; i++) {
            char digit = number.charAt(i);
            
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            
            stack.push(digit);
        }
        
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            result.append(digit);
        }
        
        return result.toString();
    }
}
