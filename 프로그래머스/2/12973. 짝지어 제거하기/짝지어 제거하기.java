class Solution {
    public int solution(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (char c : s.toCharArray()) {
            // 스택의 맨 위 요소와 현재 문자가 같으면 제거
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                // 그렇지 않으면 스택에 추가
                stack.push(c);
            }
        }
        
        // 스택이 비어 있으면 문자열이 모두 제거된 것
        return stack.isEmpty() ? 1 : 0;
    }
}