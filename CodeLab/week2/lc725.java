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
class lc725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode ptr = root;
        int len = 0;
        while ( ptr != null ) {
            ptr = ptr.next;
            len++;
        }
        int quotient = len / k;
        int remainder = len % k;
        ptr = root;
        ListNode[] result = new ListNode[k]; 
        int i = 0;
        while ( i < k && ptr != null) {
            result[i] = ptr;
            int j = 0;
            if ( i < remainder ) {
                while ( j < quotient ) {
                    ptr = ptr.next; 
                    j++;
                }
            } else {
                while ( j < quotient -1 ) {
                    ptr = ptr.next; 
                    j++;
                }
            }

            ListNode temp = ptr;
            ptr = ptr.next;
            temp.next = null;
            i++;
        }
        return result;
    }
}