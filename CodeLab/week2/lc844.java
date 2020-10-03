class lc844 {
    public boolean backspaceCompare(String S, String T) {
        String s1 = processString(S);
        String t1 = processString(T);
        return s1.equals(t1);
    }
    public String processString(String S) {
        String result = "";
        for (char c:S.toCharArray()) {
            if (c=='#' && result.length() != 0) {
                int len = result.length();
                result = result.substring(0,len-1);
            } 
            if (c!='#') {
                result += c;
            }
        }
        return result;
    }
}