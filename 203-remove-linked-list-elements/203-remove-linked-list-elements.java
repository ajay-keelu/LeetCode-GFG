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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        List<Integer>li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val!=val)
                li.add(temp.val);
            temp = temp.next;
        }
        ListNode root=null;
        temp = null;
        for(int i=0;i<li.size();i++)
        {
            if(root == null)
                root = temp = new ListNode((int)li.get(i));
            else{
                temp.next = new ListNode((int)li.get(i));
                    temp = temp.next;
            }
        }
        return root;
    }
}