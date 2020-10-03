class lc921 {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<Character>();
        for(char c:S.toCharArray()) {
            if (c == '(') {
                System.out.println(c);
                stack.push(c);
            } else {
                if (stack.empty() == true 
                    || stack.peek() == ')') {
                    stack.push(c);          
                } else {
                    stack.pop();
                }
            }
        }
        int count = 0;
        while (stack.empty() != true) {
            stack.pop();
            count++;
        }
        return count;    
    }
}