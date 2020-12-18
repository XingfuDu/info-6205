class lc86 {
    public ListNode partition(ListNode head, int x) {
        ListNode t1=new ListNode(0);
        ListNode p1=t1;
        ListNode t2=new ListNode(0);
        ListNode p2=t2;
        while(head!=null) {
            if(head.val>=x) {
                t1.next=new ListNode(head.val);
                t1=t1.next;
            } else {
                t2.next=new ListNode(head.val);
                t2=t2.next;
            }
            head=head.next;
        }
        t2.next=p1.next;
        return p2.next;
    }
}
