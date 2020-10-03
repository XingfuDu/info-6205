class lc735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int n : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && n < 0 && stack.peek() > 0) {                
                if (n + stack.peek() == 0) {
                    stack.pop();
                    destroyed = true;
                    break; 
                } else if (n + stack.peek() < 0) {
                    stack.pop(); 
                } else {
                    n = stack.pop();
                    break;
                }
            }
            if (!destroyed)
                stack.push(n);            
        }

        int[] result = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}