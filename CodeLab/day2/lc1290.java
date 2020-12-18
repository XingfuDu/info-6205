class lc1290 {
    public int getDecimalValue(ListNode head) {
        int res=0;
        if(head==null) {
            return res;
        }
        while(head!=null) {
            res=res*2+head.val;
            head=head.next;
        }
        return res;   
    }
}
