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
class lc328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode neck = head.next;
        int count = 2;
        while (ptr2.next != null) {
            ptr1.next = ptr2.next;
            ptr1 = ptr2;
            ptr2 = ptr2.next;
            count++;
        }
        if (count % 2 == 0) {
            ptr1.next = neck;
        } else {
            ptr2.next = neck;
            ptr1.next = null;
        }
        return head;
    }
}