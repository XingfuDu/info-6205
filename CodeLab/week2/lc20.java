class lc20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        String left="([{";
        String right=")]}";
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (stack.empty() == true 
                || left.indexOf(stack.peek()) 
		!= right.indexOf(ch)) {
                if (right.indexOf(ch) != -1) {
                    return false;
                }
                stack.push(ch);
            } else {
                stack.pop();
            }
        }
        if (stack.empty() == true) {
            return true;
        } 
        return false;
    }
}