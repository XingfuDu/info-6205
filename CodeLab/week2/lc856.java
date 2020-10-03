class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                stack.push(-1);
            } else {
                int curr=0;
                while(!stack.isEmpty() && stack.peek() != -1) {
                    curr += stack.pop();
                }
                stack.pop();
                if(curr == 0) {
                    stack.push(1);
                } else {
                    stack.push(2*curr);
                }
            }
        }
        int result=0;
        while(!stack.isEmpty()) {
	    result += stack.pop();
        }
        return result;
    }
}