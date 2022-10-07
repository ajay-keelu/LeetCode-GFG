/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = sizeList(headA);
        int l2 = sizeList(headB);
        if(l1>l2)
        {
            for(int i=0;i<l1-l2;i++)
                headA = headA.next;
        }
        else
        {
            for(int i=0;i<l2-l1;i++)
                headB = headB.next;
        }
        
        while(true)
        {
            if(headA==null||headB==null)
                return null;
            if(headA==headB)
                break;
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
        
    }
    public static int sizeList(ListNode head)
    {
        int l = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            l++;
            temp = temp.next;
        }
        return l;
    }
}