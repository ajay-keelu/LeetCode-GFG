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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer>al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
        al.remove(al.size() - n);
        ListNode root = null;
        for(int i=0;i<al.size();i++)
        {
            if(root == null)
                root = temp = new ListNode(al.get(i));
            else{
                temp.next = new ListNode(al.get(i));
                temp = temp.next;
            }
        }
        return root;
    }
}