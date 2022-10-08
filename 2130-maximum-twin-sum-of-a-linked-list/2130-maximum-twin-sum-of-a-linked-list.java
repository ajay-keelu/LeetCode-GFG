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
    public int pairSum(ListNode head) {
        int max = 0;
        List<Integer>li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            li.add(temp.val);
            temp = temp.next;
        }
        int n = li.size();
        int i = 0,j=n-1;
        while(i<j)
        {
            if(max < (int)li.get(i)+(int)li.get(j))
                    max = (int)li.get(i)+(int)li.get(j);
            i++;
            j--;
        }
        return max;
    }
}