class lc1021 {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for (int i = 0 ; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (count == 0 && c == '(') {
                count++;
            } else if (count == 1 && c == ')') {
                count--;
            } else {
                stack.push(c);
                if (c == '(') {
                    count++;
                } else {
                    count--;
                }
            }
        }
        String result = "";
        while (stack.empty() != true) {
            result = stack.pop() + result;
        }
        return result;
    }
}