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
class lc143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return ;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        ListNode l2rev = reverse(l2);
        head = merge(l1,l2rev);
        
    }
    public ListNode reverse(ListNode head) {
        if (head == null || head.next==null) {
            return head;
        } else {
            ListNode next = head.next;
            ListNode result = reverse(next);
            next.next = head;
            head.next = null;
            return result;
        }
    }
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null ) {
            return l2;
        }
        if (l2 == null ) {
            return l1;
        }
        ListNode temp = merge(l1.next,l2.next);
        l1.next = l2;
        l2.next = temp;
        return l1;
    }
}