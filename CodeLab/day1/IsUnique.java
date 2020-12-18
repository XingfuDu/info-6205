class IsUnique {
    public boolean isUnique(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
                if (list.isEmpty() || !list.contains(s.charAt(i)) {
                        continue;
                } else {
                        return false;
                }
        }   
        return true;    
    }
}
