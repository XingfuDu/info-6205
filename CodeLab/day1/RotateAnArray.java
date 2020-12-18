class RotateAnArray {
    public void rotate(int[] nums, int k) {
        int[] a=new int[nums.length];
        if(nums==null) {
            return;
        }
        for(int i=0;i<nums.length;i++) {
            int index=(nums.length-k+i)%nums.length;
            if(index<0) {
                index=index+nums.length;
            }
            a[i]=nums[index];
        }
        for(int i=0;i<nums.length;i++) {
            nums[i]=a[i];
        }
        
    }
}
