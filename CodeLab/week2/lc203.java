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
class lc203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ptr1 = dummy;
        ListNode ptr2 = dummy.next;
        while (ptr1 != null) {
            while (ptr2 != null && ptr2.val == val) {
                ptr2 = ptr2.next;
            }
            ptr1.next = ptr2;
            ptr1 = ptr1.next;
            if (ptr2 != null) {
                ptr2 = ptr2.next;
            }
        }
        return dummy.next;
        
    }
}