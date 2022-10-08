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
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer>li = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            if(li.size()==0)
                li.add(temp.val);
            if((int)li.get(li.size()-1)!=temp.val)
                li.add(temp.val);
            temp = temp.next;
        }
        ListNode root = null;
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