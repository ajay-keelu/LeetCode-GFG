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
        ListNode temp = head;
        List<Integer>li= new ArrayList<>();
        Map<Integer,Integer>hm = new HashMap<>();
        while(temp!=null)
        {
            int n = temp.val;
            if(hm.containsKey(n))
                hm.put(n,(int)hm.get(n)+1);
            else{
                hm.put(n,1);
                li.add(n);
            }
            temp = temp.next;
        }
        ListNode root = null;
        for(int i=0;i<li.size();i++)
        {
            if((int)hm.get(li.get(i)) == 1)
            {
                if(root == null)
                    root = temp = new ListNode(li.get(i));
                else{
                    temp.next = new ListNode(li.get(i));
                    temp = temp.next;
                }
            }
        }
        return root;
    }
    
}