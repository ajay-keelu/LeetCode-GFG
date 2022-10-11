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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
        if(left!=right)
        Collections.reverse(al.subList(left-1,right));
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