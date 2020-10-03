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
class lc1019 {
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        int len = 0 ;
        ListNode ptr = head;
        while (ptr != null) {
            ptr = ptr.next;
            len++;
        }
        int[] result = new int[len];
        ptr = head;
        for (int i = 0; i < len; i++) {
            ListNode p = ptr.next;
            result[i] = 0;
            while (p != null) {
                if (p.val > ptr.val) {
                    result[i] = p.val;
                    break;
                }
                p = p.next;
            }
            ptr = ptr.next;
            
        }
        return result;
    }
}