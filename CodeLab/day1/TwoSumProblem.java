class TwoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        //int res[]=new int[2];
        final HashMap<Integer,Integer> mymap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            mymap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            Integer v=mymap.get(target-nums[i]);
            if(v!=null && v!=i) {
                return new int[]{i,v};
            }
        }
        return null;
        
    }
}
