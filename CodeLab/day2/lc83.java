class lc83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        
        ListNode p1, p2,temp;
        p1=head;
        p2=head.next;
        while(p2!=null) {
          if(p1.val!=p2.val) {
            temp=p2;
            p2=p2.next;
            p1=temp;
          } else {
            p2=p2.next; 
            p1.next=p2;
          }
        }
        return head;
    }
}
