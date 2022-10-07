/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(true)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr2==null||ptr2.next == null)
                return false;
            if(ptr1 == ptr2)
                break;
        }
        return true;
    }
}