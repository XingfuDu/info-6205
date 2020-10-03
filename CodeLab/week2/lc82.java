/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class lc82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(head.val-1);
        dummy.next = head;
        ListNode ptr1 = dummy;
        ListNode ptr2 = dummy.next;
        while ( ptr2 != null && ptr2.next != null ) {
            boolean dup = false;
            while ( ptr2.next != null && ptr2.val == ptr2.next.val ) {
                ptr2 = ptr2.next;
                dup = true;
            }
            if ( dup == true ) {
                ptr2 = ptr2.next;
                ptr1.next = ptr2; 
                continue;
            }
            dup = false;
            ptr1 = ptr2;
            ptr2 = ptr2.next;
        } 
        return dummy.next;
        
    }
}