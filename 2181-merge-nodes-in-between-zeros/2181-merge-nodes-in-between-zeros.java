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
    public ListNode mergeNodes(ListNode head) {
        List<Integer>al=new ArrayList<>();
        ListNode temp = head;
        int sum = 0;
        while(temp!=null)
        {
            if(temp.val == 0 && sum!=0)
            {
                al.add(sum);
                sum = 0;
            }
            else{
                sum+= temp.val;
            }
            temp = temp.next;
        }
        ListNode root = null;
        for(int i =0 ;i<al.size();i++)
        {
            if(root == null)
                root = temp = new ListNode(al.get(i));
            else{
                temp.next = new ListNode(al.get(i));
                temp=temp.next;
            }
        }
        return root;
    }
}