class lc739 {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = i+1; j < T.length; j++) {
                count++;
                if (T[j] > T[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                count = 0;
            }
            result[i] = count--;
            
        }
        return result;
        
    }
}